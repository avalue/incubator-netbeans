/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.test.subversion.main.checkout;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import org.netbeans.jellytools.JellyTestCase;
import org.netbeans.jellytools.NbDialogOperator;
import org.netbeans.jellytools.NewProjectWizardOperator;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JTextFieldOperator;
import org.netbeans.jemmy.operators.Operator;
import org.netbeans.jemmy.operators.Operator.DefaultStringComparator;
import org.netbeans.junit.NbModuleSuite;
import org.netbeans.test.subversion.operators.NewJavaProjectNameLocationStepOperator;
import org.netbeans.test.subversion.operators.CheckoutWizardOperator;
import org.netbeans.test.subversion.operators.RepositoryStepOperator;
import org.netbeans.test.subversion.operators.WorkDirStepOperator;
import org.netbeans.test.subversion.utils.MessageHandler;
import org.netbeans.test.subversion.utils.RepositoryMaintenance;
import org.netbeans.test.subversion.utils.TestKit;

/**
 *
 * @author pvcs
 */
public class CreateProjectVersionedDirTest extends JellyTestCase {

    public static final String TMP_PATH = "/tmp";
    public static final String REPO_PATH = "repo";
    public static final String WORK_PATH = "work";
    public static final String PROJECT_NAME = "JavaApp";
    public File projectPath;
    Operator.DefaultStringComparator comOperator;
    Operator.DefaultStringComparator oldOperator;
    static Logger log;

    /**
     * Creates a new instance of CreateProjectVersionedDirTest
     */
    public CreateProjectVersionedDirTest(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        System.out.println("### " + getName() + " ###");
        if (log == null) {
            log = Logger.getLogger(TestKit.LOGGER_NAME);
            log.setLevel(Level.ALL);
            TestKit.removeHandlers(log);
        } else {
            TestKit.removeHandlers(log);
        }

    }

    public static Test suite() {
        return NbModuleSuite.create(
                NbModuleSuite.createConfiguration(CreateProjectVersionedDirTest.class).addTest(
                "testCreateNewProject").enableModules(".*").clusters(".*"));
    }

    public void testCreateNewProject() throws Exception {

        MessageHandler mh = new MessageHandler("Checking out");
        log.addHandler(mh);
        TestKit.closeProject(PROJECT_NAME);
        if (TestKit.getOsName().indexOf("Mac") > -1) {
            new NewProjectWizardOperator().invoke().close();
        }

        comOperator = new Operator.DefaultStringComparator(true, true);
        oldOperator = (DefaultStringComparator) Operator.getDefaultStringComparator();
        Operator.setDefaultStringComparator(comOperator);
        CheckoutWizardOperator.invoke();
        Operator.setDefaultStringComparator(oldOperator);
        RepositoryStepOperator rso = new RepositoryStepOperator();

        //create repository...
        File work = new File(TMP_PATH + File.separator + WORK_PATH + File.separator + "w" + System.currentTimeMillis());
        new File(TMP_PATH).mkdirs();
        work.mkdirs();
        RepositoryMaintenance.deleteFolder(new File(TMP_PATH + File.separator + REPO_PATH));
        RepositoryMaintenance.createRepository(TMP_PATH + File.separator + REPO_PATH);
        RepositoryMaintenance.loadRepositoryFromFile(TMP_PATH + File.separator + REPO_PATH, getDataDir().getCanonicalPath() + File.separator + "repo_dump");
        rso.setRepositoryURL(RepositoryStepOperator.ITEM_FILE + RepositoryMaintenance.changeFileSeparator(TMP_PATH + File.separator + REPO_PATH, false));

        rso.next();
        WorkDirStepOperator wdso = new WorkDirStepOperator();
        wdso.setRepositoryFolder("trunk/" + PROJECT_NAME);
        wdso.setLocalFolder(work.getCanonicalPath());
        wdso.checkCheckoutContentOnly(false);
        wdso.finish();
        //open project
        TestKit.waitText(mh);

        NbDialogOperator nbdialog = new NbDialogOperator("Checkout Completed");
        JButtonOperator open = new JButtonOperator(nbdialog, "Open Project");
        open.push();
        TestKit.waitForScanFinishedSimple();

        NewProjectWizardOperator npwo = NewProjectWizardOperator.invoke();
        npwo.selectCategory("Java");
        npwo.selectProject("Java Application");
        npwo.next();
        NewJavaProjectNameLocationStepOperator npnlso = new NewJavaProjectNameLocationStepOperator();
        new JTextFieldOperator(npnlso, 1).setText(work.getAbsolutePath() + File.separator + PROJECT_NAME+"2" + File.separator + "src"); // NOI18N
        new JTextFieldOperator(npnlso, 0).setText(PROJECT_NAME+"2"); // NOI18N
        new NewProjectWizardOperator().finish();
        TestKit.waitForScanFinishedSimple();

        TestKit.closeProject(PROJECT_NAME);
        TestKit.closeProject(PROJECT_NAME+"2");

    }
}
