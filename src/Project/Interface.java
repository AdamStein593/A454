package Project;

/**
 * An application to be used as a calculator for M1 inclined planes questions
 *
 * @author Adam Stein
 */
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {
    //decleration of global variables

    List<JTextField> fields = new ArrayList();
    Answer answer;

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        //hiding the working out screen so that only the input screen is displayed
        workingScreen.setVisible(false);

        //setting up the input screen
        massField.setEditable(false);
        massField.setBackground(Color.GRAY);

        //text areas on working out screen should never be editable 
        working1Text.setEditable(false);
        working2Text.setEditable(false);

        //adding all the fields on the input screen to a List of JTextFields called "fields"
        fields.add(massField);
        fields.add(forceField);
        fields.add(accelerationField);
        fields.add(fcField);
        fields.add(angleField);
        fields.add(frictionForceField);
        fields.add(reactionField);
        fields.add(weightField);



    }

    /**
     * This method is called from within the constructor to initialise the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slippingDirectionButtonGroup = new javax.swing.ButtonGroup();
        inputScreen = new javax.swing.JLayeredPane();
        closeButton2 = new javax.swing.JButton();
        diagram = new javax.swing.JLabel();
        titleLabel2 = new javax.swing.JLabel();
        slippingDirectionLabel2 = new javax.swing.JLabel();
        downButton = new javax.swing.JRadioButton();
        upButton = new javax.swing.JRadioButton();
        accelerationLabel2 = new javax.swing.JLabel();
        accelerationField = new javax.swing.JTextField();
        massField = new javax.swing.JTextField();
        forceLabel2 = new javax.swing.JLabel();
        forceField = new javax.swing.JTextField();
        reactionField = new javax.swing.JTextField();
        reactionLabel2 = new javax.swing.JLabel();
        angleLabel2 = new javax.swing.JLabel();
        angleField = new javax.swing.JTextField();
        frictionForceLabel2 = new javax.swing.JLabel();
        frictionForceField = new javax.swing.JTextField();
        fcField = new javax.swing.JTextField();
        fcLabel2 = new javax.swing.JLabel();
        weightLabel2 = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        massLabel2 = new javax.swing.JLabel();
        valueToCalculateComboBox = new javax.swing.JComboBox();
        valueToCalculateLabel2 = new javax.swing.JLabel();
        workingScreen = new javax.swing.JLayeredPane();
        explain2Button = new javax.swing.JButton();
        explain1Button = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        valueToCalculateLabel = new javax.swing.JLabel();
        working1Pane = new javax.swing.JScrollPane();
        working1Text = new javax.swing.JTextArea();
        working2Pane = new javax.swing.JScrollPane();
        working2Text = new javax.swing.JTextArea();
        Step1Label = new javax.swing.JLabel();
        step2Label = new javax.swing.JLabel();
        answerTitleLabel = new javax.swing.JLabel();
        answerLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        accelerationLabel = new javax.swing.JLabel();
        accelerationValueLabel = new javax.swing.JLabel();
        forceLabel = new javax.swing.JLabel();
        forceValueLabel = new javax.swing.JLabel();
        reactionLabel = new javax.swing.JLabel();
        reactionValueLabel = new javax.swing.JLabel();
        angleLabel = new javax.swing.JLabel();
        angleValueLabel = new javax.swing.JLabel();
        slippingDirectionLabel = new javax.swing.JLabel();
        slippingDirectionValueLabel = new javax.swing.JLabel();
        fcLabel = new javax.swing.JLabel();
        fcValueLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        weightValueLabel = new javax.swing.JLabel();
        massLabel = new javax.swing.JLabel();
        massValueLabel = new javax.swing.JLabel();
        frictionForceLabel = new javax.swing.JLabel();
        frictionForceValueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeButton2.setText("Close");
        closeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton2ActionPerformed(evt);
            }
        });
        closeButton2.setBounds(490, 0, 80, 30);
        inputScreen.add(closeButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        diagram.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adam\\Pictures\\diagram3.png")); // NOI18N
        diagram.setBounds(30, 70, 190, 130);
        inputScreen.add(diagram, javax.swing.JLayeredPane.DEFAULT_LAYER);

        titleLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel2.setText("Inclined Planes");
        titleLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        titleLabel2.setBounds(0, 0, 570, 60);
        inputScreen.add(titleLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        slippingDirectionLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        slippingDirectionLabel2.setText("Slipping Direction");
        slippingDirectionLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        slippingDirectionLabel2.setBounds(250, 120, 120, 30);
        inputScreen.add(slippingDirectionLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        slippingDirectionButtonGroup.add(downButton);
        downButton.setText("Down");
        downButton.setBounds(420, 120, 70, 23);
        inputScreen.add(downButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        slippingDirectionButtonGroup.add(upButton);
        upButton.setText("Up");
        upButton.setBounds(380, 120, 40, 23);
        inputScreen.add(upButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        accelerationLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        accelerationLabel2.setText("Acceleration");
        accelerationLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        accelerationLabel2.setBounds(390, 230, 90, 30);
        inputScreen.add(accelerationLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        accelerationField.setBounds(480, 230, 80, 30);
        inputScreen.add(accelerationField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        massField.setBounds(100, 230, 80, 30);
        inputScreen.add(massField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        forceLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        forceLabel2.setText("Force");
        forceLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        forceLabel2.setBounds(200, 230, 90, 30);
        inputScreen.add(forceLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        forceField.setBounds(290, 230, 80, 30);
        inputScreen.add(forceField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        reactionField.setBounds(100, 310, 80, 30);
        inputScreen.add(reactionField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        reactionLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        reactionLabel2.setText("Reaction");
        reactionLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        reactionLabel2.setBounds(10, 310, 90, 30);
        inputScreen.add(reactionLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        angleLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        angleLabel2.setText("θ");
        angleLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        angleLabel2.setBounds(200, 270, 90, 30);
        inputScreen.add(angleLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        angleField.setBounds(290, 270, 80, 30);
        inputScreen.add(angleField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        frictionForceLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        frictionForceLabel2.setText("Friction Force");
        frictionForceLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        frictionForceLabel2.setBounds(390, 270, 90, 30);
        inputScreen.add(frictionForceLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        frictionForceField.setBounds(480, 270, 80, 30);
        inputScreen.add(frictionForceField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fcField.setBounds(100, 270, 80, 30);
        inputScreen.add(fcField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fcLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        fcLabel2.setText("µ");
        fcLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fcLabel2.setBounds(10, 270, 90, 30);
        inputScreen.add(fcLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        weightLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        weightLabel2.setText("Weight");
        weightLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        weightLabel2.setBounds(200, 310, 90, 30);
        inputScreen.add(weightLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        weightField.setBounds(290, 310, 80, 30);
        inputScreen.add(weightField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        submitButton.setBounds(390, 310, 170, 100);
        inputScreen.add(submitButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        clearButton.setBounds(10, 350, 170, 60);
        inputScreen.add(clearButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        massLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        massLabel2.setText("Mass");
        massLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        massLabel2.setBounds(10, 230, 90, 30);
        inputScreen.add(massLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        valueToCalculateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mass", "Force", "Acceleration", "µ", "θ", "Friction Force", "Reaction", "Weight" }));
        valueToCalculateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueToCalculateComboBoxActionPerformed(evt);
            }
        });
        valueToCalculateComboBox.setBounds(370, 70, 120, 30);
        inputScreen.add(valueToCalculateComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        valueToCalculateLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        valueToCalculateLabel2.setText("Value To Calculate");
        valueToCalculateLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        valueToCalculateLabel2.setBounds(250, 70, 120, 30);
        inputScreen.add(valueToCalculateLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        explain2Button.setText("Explain");
        explain2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explain2ButtonActionPerformed(evt);
            }
        });
        explain2Button.setBounds(50, 150, 90, 40);
        workingScreen.add(explain2Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        explain1Button.setText("Explain");
        explain1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explain1ButtonActionPerformed(evt);
            }
        });
        explain1Button.setBounds(50, 100, 90, 40);
        workingScreen.add(explain1Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        closeButton.setBounds(490, 0, 80, 30);
        workingScreen.add(closeButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Working Out");
        titleLabel.setBorder(new javax.swing.border.MatteBorder(null));
        titleLabel.setBounds(0, 0, 570, 60);
        workingScreen.add(titleLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        valueLabel.setText("Value being calculated:");
        valueLabel.setBounds(0, 60, 130, 30);
        workingScreen.add(valueLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        valueToCalculateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueToCalculateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        valueToCalculateLabel.setBounds(140, 60, 130, 30);
        workingScreen.add(valueToCalculateLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        working1Text.setColumns(20);
        working1Text.setRows(5);
        working1Text.setText("\n");
        working1Pane.setViewportView(working1Text);

        working1Pane.setBounds(140, 100, 420, 40);
        workingScreen.add(working1Pane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        working2Text.setColumns(20);
        working2Text.setRows(5);
        working2Text.setText("\n");
        working2Pane.setViewportView(working2Text);

        working2Pane.setBounds(140, 150, 420, 40);
        workingScreen.add(working2Pane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Step1Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Step1Label.setText("Step 1:");
        Step1Label.setBounds(0, 100, 130, 40);
        workingScreen.add(Step1Label, javax.swing.JLayeredPane.DEFAULT_LAYER);

        step2Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        step2Label.setText("Step 2:");
        step2Label.setBounds(0, 150, 130, 40);
        workingScreen.add(step2Label, javax.swing.JLayeredPane.DEFAULT_LAYER);

        answerTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answerTitleLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        answerTitleLabel.setBounds(140, 200, 130, 30);
        workingScreen.add(answerTitleLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        answerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        answerLabel.setBounds(280, 200, 130, 30);
        workingScreen.add(answerLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        backButton.setBounds(420, 200, 140, 30);
        workingScreen.add(backButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        accelerationLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        accelerationLabel.setText("Acceleration");
        accelerationLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        accelerationLabel.setBounds(390, 250, 90, 30);
        workingScreen.add(accelerationLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        accelerationValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accelerationValueLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        accelerationValueLabel.setBounds(480, 250, 80, 30);
        workingScreen.add(accelerationValueLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        forceLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        forceLabel.setText("Force");
        forceLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        forceLabel.setBounds(200, 250, 90, 30);
        workingScreen.add(forceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        forceValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forceValueLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        forceValueLabel.setBounds(290, 250, 80, 30);
        workingScreen.add(forceValueLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        reactionLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        reactionLabel.setText("Reaction");
        reactionLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        reactionLabel.setBounds(10, 330, 90, 30);
        workingScreen.add(reactionLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        reactionValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reactionValueLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reactionValueLabel.setBounds(100, 330, 80, 30);
        workingScreen.add(reactionValueLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        angleLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        angleLabel.setText("θ");
        angleLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        angleLabel.setBounds(200, 290, 90, 30);
        workingScreen.add(angleLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        angleValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angleValueLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angleValueLabel.setBounds(290, 290, 80, 30);
        workingScreen.add(angleValueLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        slippingDirectionLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        slippingDirectionLabel.setText("Slipping");
        slippingDirectionLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        slippingDirectionLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slippingDirectionLabel.setBounds(390, 330, 90, 30);
        workingScreen.add(slippingDirectionLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        slippingDirectionValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slippingDirectionValueLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        slippingDirectionValueLabel.setBounds(480, 330, 80, 30);
        workingScreen.add(slippingDirectionValueLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fcLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        fcLabel.setText("µ");
        fcLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fcLabel.setBounds(10, 290, 90, 30);
        workingScreen.add(fcLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fcValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fcValueLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fcValueLabel.setBounds(100, 290, 80, 30);
        workingScreen.add(fcValueLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        weightLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        weightLabel.setText("Weight");
        weightLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        weightLabel.setBounds(200, 330, 90, 30);
        workingScreen.add(weightLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        weightValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weightValueLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        weightValueLabel.setBounds(290, 330, 80, 30);
        workingScreen.add(weightValueLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        massLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        massLabel.setText("Mass");
        massLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        massLabel.setBounds(10, 250, 90, 30);
        workingScreen.add(massLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        massValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        massValueLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        massValueLabel.setBounds(100, 250, 80, 30);
        workingScreen.add(massValueLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        frictionForceLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        frictionForceLabel.setText("Friction Force");
        frictionForceLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        frictionForceLabel.setBounds(390, 290, 90, 30);
        workingScreen.add(frictionForceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        frictionForceValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frictionForceValueLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        frictionForceValueLabel.setBounds(480, 290, 80, 30);
        workingScreen.add(frictionForceValueLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(workingScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(workingScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
     * Sub Routine executed on click of the close button on the working out screen
     */
    private void closeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButton2ActionPerformed
    /*
     * Sub Routine executed on click of the close button on the input screen
     */
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed
    /*
     * Sub Routine executed on click of the back button on the working out screen
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //swaps screens
        workingScreen.setVisible(false);
        inputScreen.setVisible(true);

        //reset the working out screen to format of when it was first opened
        reset();
        valueToCalculateComboBox.setSelectedItem("Mass");
        slippingDirectionButtonGroup.clearSelection();
    }//GEN-LAST:event_backButtonActionPerformed
    /*
     * Sub routine executed on click of the submit button on the input screen
     * 
     * Data on the input screen is validated here. If valid, user will be brought
     * to working out screen. If invalid, the user will have to fix the errors before
     * they can progress. Invalid fields are highlighted red and a dialogue box with 
     * errors is outputted.
     */

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            //resetting the colours of fields so that corrected fields will no longer show up red
            colourReset();
            alteringValueToCalculateField(valueToCalculateComboBox.getSelectedIndex());

            //decleration of variables
            boolean valid = true;
            String alert = "";
            int counter = 0;

            //for each text field on input screen....
            for (JTextField field : fields) {

                //validation to ensure fields are not empty
                //validation only applies to editable fields. The value being calculated will have an empty field
                if (field.isEditable() == true) {
                    if (field.getText().equals("")) {
                        field.setBackground(Color.RED);
                        //the name of the invalid field is found using the fieldName sub routine
                        alert += "The " + fieldName(counter) + " field is empty \n";
                        //valid set to false to deny access to working out screen 
                        valid = false;


                    } //validation to ensure that fields are greater than or equal to 0
                    /*else if is used because only fields that aren't empty need to be 
                     checked and this prevents an error from preforming Double.parseDouble
                     on an empty field*/ 
                    else if (Double.parseDouble(field.getText()) < 0) {
                        field.setBackground(Color.RED);
                        alert += "The " + fieldName(counter) + " field is less than 0 \n";
                        valid = false;
                    }
                }
                //increement counter on each iteration to know which field is being validated
                counter++;
            }
            //validation to ensure µ is less than 1
            if (!fcField.getText().equals("") && fcField.isEditable() && Double.parseDouble(fcField.getText()) >= 1) {
                fcField.setBackground(Color.RED);
                alert += "µ is greater than 1\n";
                valid = false;
            }
            //validation to ensure θ is less than 90
            if (!angleField.getText().equals("") && angleField.isEditable() && Double.parseDouble(angleField.getText()) >= 90) {
                angleField.setBackground(Color.RED);
                alert += "θ is greater than 90 degrees\n";
                valid = false;
            }
            //validation to ensure a slipping direction has been selected
            if (slippingDirectionButtonGroup.isSelected(null)) {
                valid = false;
                alert += "A slipping direction has not been selected\n";
            }


            if (valid == true) {
                //if validation has been passed then processing on input begins and user can pass to working out screen
                //new Question object called question created
                Question question = new Question(fields, valueToCalculateComboBox, upButton, downButton);
                //swap to working out screen
                workingScreen.setVisible(true);
                inputScreen.setVisible(false);
                //The Answer object answer is initialised by the solve function being performed on the question object
                answer = question.solve();
                //set values of fields on the working screen using the answer object
                working1Text.setText(answer.getStep1());
                working2Text.setText(answer.getStep2());
                valueToCalculateLabel.setText(valueToCalculateComboBox.getSelectedItem().toString());
                answerTitleLabel.setText(valueToCalculateComboBox.getSelectedItem().toString() + " to 2s.f.");
                answerLabel.setText(String.valueOf(answer.getResult()));
                setValuesOnWorkingOutScreen();
            } else {
                //if validation failed then output the errors in a dialogue box
                JOptionPane.showMessageDialog(null, alert);
            }
        } catch (NumberFormatException | HeadlessException e) {
            //exception for if the fields can't be read properly
            JOptionPane.showMessageDialog(null, "Invalid characters entered on form");
        }


    }//GEN-LAST:event_submitButtonActionPerformed
    /*
     * Sub Routine executed on selection of item in the combobox 
     */
    private void valueToCalculateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueToCalculateComboBoxActionPerformed
        //reset all values on inout screen when a new item is selected
        reset();
        int index = valueToCalculateComboBox.getSelectedIndex();
        alteringValueToCalculateField(index);

    }//GEN-LAST:event_valueToCalculateComboBoxActionPerformed
    /*
     * Sub Routine executed on click of the clear button
     * Resets all the fields
     */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        reset();
        valueToCalculateComboBox.setSelectedItem("Mass");
        slippingDirectionButtonGroup.clearSelection();
    }//GEN-LAST:event_clearButtonActionPerformed
    /*
     * Sub Routine executed on click of the explain step 2 button
     * A dialogue box will only be outputted if there is working out to be explained 
     */
    private void explain2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explain2ButtonActionPerformed
        if (!answer.getExplainStep2().equals("")) {
            JOptionPane.showMessageDialog(null, answer.getExplainStep2());
        }
    }//GEN-LAST:event_explain2ButtonActionPerformed
    /*
     * Sub Routine executed on click of the explain step 1 button
     * A dialogue box will be outputted to explain working out 
     */
    private void explain1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explain1ButtonActionPerformed
        JOptionPane.showMessageDialog(null, answer.getExplainStep1());
    }//GEN-LAST:event_explain1ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    /*
     *Sub routine to clear all the fields of text, make all fields editable 
     * and reset the colour of all fields to white 
     */
    public void reset() {
        colourReset();
        editableReset();
        textReset();
    }
    
    /*
     * Sub routine that turns all fields white
     */
    public void colourReset() {
        for (JTextField field : fields) {
            field.setBackground(Color.WHITE);
        }
    }
    
    /*
     * sub routine that makes all fields editable
     */
    private void editableReset() {
        for (JTextField field : fields) {
            field.setEditable(true);
        }
    }
    
    /*
     * sub routine that clears the text from all the fields
     */
    public void textReset() {
        for (JTextField field : fields) {
            field.setText("");
        }
    }
    
    /**
     * sub routine that alters the field of the value being calculated
     * The field is turned grey and is no longer able to be edited by the user
     * 
     * @param index the position of the field that is being calculated in the fields list
     */
    private void alteringValueToCalculateField(int index) {
        fields.get(index).setEditable(false);
        fields.get(index).setBackground(Color.GRAY);
    }
    
    /*
     * sub routine that displays all the values used in the calculation on the worrking out screen
     */
    private void setValuesOnWorkingOutScreen() {
        massValueLabel.setText("");
        forceValueLabel.setText("");
        accelerationValueLabel.setText("");
        fcValueLabel.setText("");
        angleValueLabel.setText("");
        frictionForceValueLabel.setText("");
        reactionValueLabel.setText("");
        weightValueLabel.setText("");
        switch (valueToCalculateComboBox.getSelectedIndex()) {
            case 0:
                weightValueLabel.setText(weightField.getText());
                break;
            case 1:
                massValueLabel.setText(massField.getText());
                accelerationValueLabel.setText(accelerationField.getText());
                angleValueLabel.setText(angleField.getText());
                frictionForceValueLabel.setText(frictionForceField.getText());
                weightValueLabel.setText(weightField.getText());
                break;
            case 2:
                massValueLabel.setText(massField.getText());
                forceValueLabel.setText(forceField.getText());
                angleValueLabel.setText(angleField.getText());
                frictionForceValueLabel.setText(frictionForceField.getText());
                weightValueLabel.setText(weightField.getText());
                break;
            case 3:
                frictionForceValueLabel.setText(frictionForceField.getText());
                reactionValueLabel.setText(reactionField.getText());
                break;
            case 4:
                weightValueLabel.setText(weightField.getText());
                reactionValueLabel.setText(reactionField.getText());
                break;
            case 5:
                fcValueLabel.setText(fcField.getText());
                reactionValueLabel.setText(reactionField.getText());
                break;
            case 6:
                weightValueLabel.setText(weightField.getText());
                angleValueLabel.setText(angleField.getText());
                break;
            case 7:
                massValueLabel.setText(massField.getText());
                break;
        }
    }
    /**
     * Function that takes takes a position of field in the fields list and returns 
     * what quantity that field represents
     * int -> String
     * @param index the position of the field in the fields list
     * @return a String of what that field represents
     */
    public String fieldName(int index) {
        switch (index) {
            case 0:
                return "Mass";
            case 1:
                return "Force";
            case 2:
                return "Acceleration";
            case 3:
                return "µ";
            case 4:
                return "θ";
            case 5:
                return "Friction Force";
            case 6:
                return "Reaction";
            case 7:
                return "Weight";
        }
        return "error";
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Step1Label;
    private javax.swing.JTextField accelerationField;
    private javax.swing.JLabel accelerationLabel;
    private javax.swing.JLabel accelerationLabel2;
    private javax.swing.JLabel accelerationValueLabel;
    private javax.swing.JTextField angleField;
    private javax.swing.JLabel angleLabel;
    private javax.swing.JLabel angleLabel2;
    private javax.swing.JLabel angleValueLabel;
    private javax.swing.JLabel answerLabel;
    private javax.swing.JLabel answerTitleLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton closeButton2;
    private javax.swing.JLabel diagram;
    private javax.swing.JRadioButton downButton;
    private javax.swing.JButton explain1Button;
    private javax.swing.JButton explain2Button;
    private javax.swing.JTextField fcField;
    private javax.swing.JLabel fcLabel;
    private javax.swing.JLabel fcLabel2;
    private javax.swing.JLabel fcValueLabel;
    private javax.swing.JTextField forceField;
    private javax.swing.JLabel forceLabel;
    private javax.swing.JLabel forceLabel2;
    private javax.swing.JLabel forceValueLabel;
    private javax.swing.JTextField frictionForceField;
    private javax.swing.JLabel frictionForceLabel;
    private javax.swing.JLabel frictionForceLabel2;
    private javax.swing.JLabel frictionForceValueLabel;
    private javax.swing.JLayeredPane inputScreen;
    private javax.swing.JTextField massField;
    private javax.swing.JLabel massLabel;
    private javax.swing.JLabel massLabel2;
    private javax.swing.JLabel massValueLabel;
    private javax.swing.JTextField reactionField;
    private javax.swing.JLabel reactionLabel;
    private javax.swing.JLabel reactionLabel2;
    private javax.swing.JLabel reactionValueLabel;
    private javax.swing.ButtonGroup slippingDirectionButtonGroup;
    private javax.swing.JLabel slippingDirectionLabel;
    private javax.swing.JLabel slippingDirectionLabel2;
    private javax.swing.JLabel slippingDirectionValueLabel;
    private javax.swing.JLabel step2Label;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JRadioButton upButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JComboBox valueToCalculateComboBox;
    private javax.swing.JLabel valueToCalculateLabel;
    private javax.swing.JLabel valueToCalculateLabel2;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JLabel weightLabel2;
    private javax.swing.JLabel weightValueLabel;
    private javax.swing.JScrollPane working1Pane;
    private javax.swing.JTextArea working1Text;
    private javax.swing.JScrollPane working2Pane;
    private javax.swing.JTextArea working2Text;
    private javax.swing.JLayeredPane workingScreen;
    // End of variables declaration//GEN-END:variables
}
