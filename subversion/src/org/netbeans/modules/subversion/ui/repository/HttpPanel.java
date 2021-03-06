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
package org.netbeans.modules.subversion.ui.repository;

/**
 *
 * @author Ondrej Vrabec
 */
public class HttpPanel extends javax.swing.JPanel {

    /**
     * Creates new form HttpPanel
     */
    public HttpPanel () {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        leaveBlankLabel = new javax.swing.JLabel();
        certPasswordLabel = new javax.swing.JLabel();
        certFileLabel = new javax.swing.JLabel();

        userLabel.setLabelFor(userTextField);
        org.openide.awt.Mnemonics.setLocalizedText(userLabel, org.openide.util.NbBundle.getMessage(HttpPanel.class, "BK0003")); // NOI18N
        userLabel.setToolTipText(org.openide.util.NbBundle.getMessage(HttpPanel.class, "TT_UserName")); // NOI18N

        passwordLabel.setLabelFor(userPasswordField);
        org.openide.awt.Mnemonics.setLocalizedText(passwordLabel, org.openide.util.NbBundle.getMessage(HttpPanel.class, "BK0004")); // NOI18N
        passwordLabel.setToolTipText(org.openide.util.NbBundle.getMessage(HttpPanel.class, "TT_Password")); // NOI18N

        userTextField.setColumns(10);

        org.openide.awt.Mnemonics.setLocalizedText(savePasswordCheckBox, org.openide.util.NbBundle.getMessage(HttpPanel.class, "BK0007")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(leaveBlankLabel, org.openide.util.NbBundle.getMessage(HttpPanel.class, "BK0005")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(proxySettingsButton, org.openide.util.NbBundle.getMessage(HttpPanel.class, "BK0006")); // NOI18N
        proxySettingsButton.setToolTipText(org.openide.util.NbBundle.getMessage(HttpPanel.class, "ACSD_ProxyDialog")); // NOI18N

        sslPanel.setVerifyInputWhenFocusTarget(false);

        certPasswordLabel.setLabelFor(certPasswordField);
        org.openide.awt.Mnemonics.setLocalizedText(certPasswordLabel, org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.certPasswordLabel.text")); // NOI18N
        certPasswordLabel.setToolTipText(org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.certPasswordLabel.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.browseButton.text")); // NOI18N
        browseButton.setToolTipText(org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.browseButton.toolTipText")); // NOI18N

        certFileLabel.setLabelFor(certFileTextField);
        org.openide.awt.Mnemonics.setLocalizedText(certFileLabel, org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.certFileLabel.text")); // NOI18N
        certFileLabel.setToolTipText(org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.certFileLabel.toolTipText")); // NOI18N

        certFileTextField.setColumns(30);

        certPasswordField.setColumns(10);

        javax.swing.GroupLayout sslPanelLayout = new javax.swing.GroupLayout(sslPanel);
        sslPanel.setLayout(sslPanelLayout);
        sslPanelLayout.setHorizontalGroup(
            sslPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sslPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(sslPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(certFileLabel)
                    .addComponent(certPasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sslPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sslPanelLayout.createSequentialGroup()
                        .addComponent(certFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseButton))
                    .addGroup(sslPanelLayout.createSequentialGroup()
                        .addComponent(certPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addGap(248, 248, 248))))
        );
        sslPanelLayout.setVerticalGroup(
            sslPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sslPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(sslPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(certFileLabel)
                    .addComponent(certFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sslPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(certPasswordLabel)
                    .addComponent(certPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        browseButton.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.browseButton.AccessibleContext.accessibleName")); // NOI18N
        certFileTextField.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.certFileTextField.AccessibleContext.accessibleName")); // NOI18N
        certFileTextField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.certFileTextField.AccessibleContext.accessibleDescription")); // NOI18N
        certPasswordField.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.certPasswordField.AccessibleContext.accessibleName")); // NOI18N
        certPasswordField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(HttpPanel.class, "HttpPanel.certPasswordField.AccessibleContext.accessibleDescription")); // NOI18N

        userPasswordField.setColumns(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proxySettingsButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savePasswordCheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(userPasswordField))
                                .addGap(12, 12, 12)
                                .addComponent(leaveBlankLabel))))
                    .addComponent(sslPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leaveBlankLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(userPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(savePasswordCheckBox)
                .addGap(18, 18, 18)
                .addComponent(sslPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(proxySettingsButton))
        );

        leaveBlankLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(HttpPanel.class, "ACSD_InfoLabel")); // NOI18N

        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(HttpPanel.class, "ACSD_RepositoryPanel")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    final javax.swing.JButton browseButton = new javax.swing.JButton();
    private javax.swing.JLabel certFileLabel;
    final javax.swing.JTextField certFileTextField = new javax.swing.JTextField();
    final javax.swing.JPasswordField certPasswordField = new javax.swing.JPasswordField();
    private javax.swing.JLabel certPasswordLabel;
    private javax.swing.JLabel leaveBlankLabel;
    private javax.swing.JLabel passwordLabel;
    final javax.swing.JButton proxySettingsButton = new javax.swing.JButton();
    final javax.swing.JCheckBox savePasswordCheckBox = new javax.swing.JCheckBox();
    final javax.swing.JPanel sslPanel = new javax.swing.JPanel();
    private javax.swing.JLabel userLabel;
    final javax.swing.JPasswordField userPasswordField = new javax.swing.JPasswordField();
    final javax.swing.JTextField userTextField = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
