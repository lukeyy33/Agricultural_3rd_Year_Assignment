
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {

    public Field[] selectedFields;
    public Farm[] selectedFarms;
    public FieldStation[] selectedFieldStations;
    public SetOfFarms theFarms;
    public SetOfFarmers theFarmers;
    public Data[] resultData;
    public ConnectionHandler handler;
    public Location[] locations = new Location[8];

    public GUI() throws ParseException {
        initComponents();
        theFarms = new SetOfFarms();
        initFarms();
        initFields();
        theFarmers = new SetOfFarmers();
        initFarmers();
    }

    /**
     * The user clicks on buttons/images, which then populate the relevant
     * fields such as 'selectedFarms'. once that object is in scope (i.e.
     * selected), the user can do various operations on it by clicking
     * buttons/images on the GUI that perform the functions listed
     */
    //the user will select a farm from the gui which will then get the farm from setOfFarms using the farmno
    /**
     * The user clicks on buttons/images, which then populate the relevant
     * fields such as 'selectedFarms'.once that object is in scope (i.e.
     * selected), the user can do various operations on it by clicking
     * buttons/images on the GUI that perform the functions listed
     *
     * @param farmNo
     * @return
     */
    public Farm selectFarm(int farmNo) {
        // TODO implement here
        return null;
    }
    //The user will select a field from the gui which will get the field by the fieldno from the fields within the selected farm

    public Field selectField(int fieldNo) {
        // TODO implement here
        return null;
    }
    //user selects a fieldStation from the gui and gets the fieldStation from the set of fields using the fieldstationno

    public FieldStation selectFieldStation(int fieldStationNo) {
        // TODO implement here
        return null;
    }

    /**
     * Output the array of resultData in a formatted way (E.g Table, Graph)
     * based on the user requested output type type (e.g. Graph, Table, etc)
     *
     * @param showResultsPopup
     */
    public void showResultsPopup(String showResultsPopup) {
        // TODO implement here

    }

    /**
     * calls getSelectedFieldStationData(), if a single field station(s) is not
     * selected then walk down the tree of farms,fields,fieldStations to
     * retrieve the fieldSations. Once the data has been retrieved the
     * selectedFarms/Fields/FieldStations arrays would be cleared If the user
     * has selected to view rainfall data across the entire farm the method
     * would iterate over all the fields in that farm and add the fieldStations
     * within those fields to the selecteFieldStations array. Once all fields
     * have been iterated over we have a complete list of all the fieldStations
     * we need to call getFieldStationData() on
     *
     * @return
     */
    public Data[] selectData() {
        // TODO implement here
        return null;
    }

    //allows the user to select multiple farms at once by setting the data from their clicks (i.e. what farms they've selected) into the relevant arrays e.g. selectedfarms[]
    public void setSelectedFarms() {
        // TODO implement here
    }

    public void setSelectedFields() {
        // TODO implement here
    }

    public void setSelectedFieldStations() {
        // TODO implement here
    }

    //triggers a "backup" in a real system, but here could just trigger serialization at a specific interval e.g. daily 
    public void backupData() {
        // TODO implement here
    }

    //displays the results in a map view
    public void showDevices() {
        // TODO implement here
    }

    /**
     * provides a graphical representation of all farms in a scaled view The
     * user will be able to interact with the view, i.e. clicking on farms,
     * which adds that to 'selectedfarms[]' and switches to the showFarmView()
     * view, which then allows the relevant operations to be done to it (such as
     * selecting a field, etc.)
     */
    public void showHomeView() {
        // TODO implement here
    }

    public void showFarmView() {
        farmView.pack();
        farmView.setVisible(true);
    }

    public void showFieldView() {

    }

    public void showFieldStationView(FieldStation fieldStation) {
    }

    /**
     * brings up a list of farmers currently registered in the system. The user
     * can search for farmers using the various methods displayed in
     * SetOfFarmers
     */
    public void showFarmersView(Farmer farmerPopup) {
    }

    public void showFarmStatusPopup(Farm farmPopup) {
    }

    /**
     * pop up allowing users to add/edit fields for farmers. this is also the
     * case for FarmPopup, FieldPopup, etc. if it has a parameter, then edit
     * that parameter, if not then create a new object of the relevant type.
     *
     * @param farmerPopup
     */
    public void showSensorPopup(Sensor sensor) {
        // TODO implement here

    }

    /**
     * Takes the user back to the previous view e.g. If the user is in the
     * fieldStation view, return to the field view - i.e., call showFieldView()
     * again with the relevant params from before
     */
    public void goBack() {
        // TODO implement here

    }

    public void exportToPDF() {
        // TODO implement here

    }

    private void initFarms() {
        theFarms.addFarm("Farm 1", new Location(10, 10, "Outdoors"), 1);
        cmbFarms.removeAllItems();
        for (int i = 0; i < theFarms.getAllFarms().size(); i++) {
            cmbFarms.addItem(theFarms.getAllFarms().get(i).getName());
        }
    }

    private void initFields() throws ParseException {
        theFarms.getAllFarms().get(0).addField("Field 1", "Outdoor", 0, "Potatoe", 1.0f);
        theFarms.getAllFarms().get(0).addField("Field 2", "Indoor", 1, "Carrot", 1.0f);
    }

    private void initFarmers() {
        theFarmers.addFarmer("Tom Mills", "test@gmail.com", "01234567890", 1234, new SetOfFarms());
        theFarmers.addFarmer("Luke Waugh", "test@gmail.com", "01234567890", 1234, new SetOfFarms());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        farmView = new javax.swing.JDialog();
        cmbFields = new javax.swing.JComboBox();
        fieldLbl = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        menuLbl1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        addFieldBtn = new javax.swing.JButton();
        removeFieldBtn = new javax.swing.JButton();
        editFieldBtn = new javax.swing.JButton();
        showFieldBtn = new javax.swing.JButton();
        farmerDialog = new javax.swing.JDialog();
        farmerNameLbl = new javax.swing.JLabel();
        farmerEmailLbl = new javax.swing.JLabel();
        cmbFarmers = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        farmerIdLbl = new javax.swing.JLabel();
        showFarmerDetailsBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        farmerTable = new javax.swing.JTable();
        addFarmerBtn = new javax.swing.JButton();
        editFarmerBtn = new javax.swing.JButton();
        deleteFarmerBtn = new javax.swing.JButton();
        farmerPhoneLbl = new javax.swing.JLabel();
        fieldsDialog = new javax.swing.JDialog();
        lblFieldType = new javax.swing.JLabel();
        lblFieldCrop = new javax.swing.JLabel();
        lblFieldPlantings = new javax.swing.JLabel();
        addFarmDialog = new javax.swing.JDialog();
        nameInput = new javax.swing.JTextField();
        nameLblAddFarm = new javax.swing.JLabel();
        xLabelAddFarm = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xCoordSpin = new javax.swing.JSpinner();
        yCoordSpin = new javax.swing.JSpinner();
        typeInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldIdSpin = new javax.swing.JSpinner();
        createFarmBtn = new javax.swing.JButton();
        confirmEditBtn = new javax.swing.JButton();
        farmCancelBtn = new javax.swing.JButton();
        deleteFarmDialog = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        delFarmNameLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ConfirmDelBtn = new javax.swing.JButton();
        cancelDelBtn = new javax.swing.JButton();
        addFieldDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addFieldName = new javax.swing.JTextField();
        addFieldType = new javax.swing.JTextField();
        addFieldNo = new javax.swing.JSpinner();
        addFieldCrop = new javax.swing.JTextField();
        addFieldArea = new javax.swing.JSpinner();
        confirmAddBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        deleteFieldDialog = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fieldNameLbl = new javax.swing.JLabel();
        confirmFieldDelete = new javax.swing.JButton();
        cancelFieldDelete = new javax.swing.JButton();
        addFarmerDialog = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        addFarmerName = new javax.swing.JTextField();
        addFarmerEmail = new javax.swing.JTextField();
        addFarmerPhone = new javax.swing.JTextField();
        confirmAddFarmerBtn = new javax.swing.JButton();
        confirmEditFarmerBtn = new javax.swing.JButton();
        cancelAddFarmerBtn = new javax.swing.JButton();
        addFarmerId = new javax.swing.JSpinner();
        cmbFarms = new javax.swing.JComboBox();
        farmsLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        showFarmsBtn = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        menuLbl = new javax.swing.JLabel();
        addFarmBtn = new javax.swing.JButton();
        editFarmBtn = new javax.swing.JButton();
        delFarmBtn = new javax.swing.JButton();
        viewFarmersBtn = new javax.swing.JButton();

        cmbFields.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        fieldLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fieldLbl.setText("Fields");

        menuLbl1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        menuLbl1.setText("Menu");

        addFieldBtn.setText("Add Field");
        addFieldBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFieldBtnActionPerformed(evt);
            }
        });

        removeFieldBtn.setText("Remove Field");
        removeFieldBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFieldBtnActionPerformed(evt);
            }
        });

        editFieldBtn.setText("Edit Field");
        editFieldBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFieldBtnActionPerformed(evt);
            }
        });

        showFieldBtn.setText("Show Selected Field");

        javax.swing.GroupLayout farmViewLayout = new javax.swing.GroupLayout(farmView.getContentPane());
        farmView.getContentPane().setLayout(farmViewLayout);
        farmViewLayout.setHorizontalGroup(
            farmViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(farmViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(farmViewLayout.createSequentialGroup()
                        .addComponent(fieldLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5)
                    .addGroup(farmViewLayout.createSequentialGroup()
                        .addGroup(farmViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(farmViewLayout.createSequentialGroup()
                                .addGroup(farmViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbFields, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuLbl1)
                                    .addComponent(addFieldBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(showFieldBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(editFieldBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeFieldBtn))
                        .addGap(0, 494, Short.MAX_VALUE))))
        );
        farmViewLayout.setVerticalGroup(
            farmViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(farmViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showFieldBtn))
                .addGap(17, 17, 17)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addFieldBtn)
                .addGap(19, 19, 19)
                .addComponent(editFieldBtn)
                .addGap(18, 18, 18)
                .addComponent(removeFieldBtn)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        farmerNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        farmerNameLbl.setText("Farmer Name:");

        farmerEmailLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        farmerEmailLbl.setText("Farmer Email:");

        cmbFarmers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbFarmers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Select a Farmer:");

        farmerIdLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        farmerIdLbl.setText("Farmer ID:");

        showFarmerDetailsBtn.setText("Show Details");
        showFarmerDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFarmerDetailsBtnActionPerformed(evt);
            }
        });

        farmerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Farms"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(farmerTable);

        addFarmerBtn.setText("Add Farmer");
        addFarmerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFarmerBtnActionPerformed(evt);
            }
        });

        editFarmerBtn.setText("Edit Farmer");
        editFarmerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFarmerBtnActionPerformed(evt);
            }
        });

        deleteFarmerBtn.setText("Delete Farmer");

        farmerPhoneLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        farmerPhoneLbl.setText("Farmer Phone: ");

        javax.swing.GroupLayout farmerDialogLayout = new javax.swing.GroupLayout(farmerDialog.getContentPane());
        farmerDialog.getContentPane().setLayout(farmerDialogLayout);
        farmerDialogLayout.setHorizontalGroup(
            farmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmerDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(farmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(farmerDialogLayout.createSequentialGroup()
                        .addGroup(farmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(farmerDialogLayout.createSequentialGroup()
                                .addGroup(farmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(farmerNameLbl)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                                    .addComponent(cmbFarmers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showFarmerDetailsBtn))
                            .addComponent(farmerIdLbl)
                            .addComponent(farmerEmailLbl)
                            .addComponent(farmerPhoneLbl)
                            .addGroup(farmerDialogLayout.createSequentialGroup()
                                .addComponent(addFarmerBtn)
                                .addGap(27, 27, 27)
                                .addComponent(editFarmerBtn)
                                .addGap(30, 30, 30)
                                .addComponent(deleteFarmerBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        farmerDialogLayout.setVerticalGroup(
            farmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmerDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(farmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbFarmers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showFarmerDetailsBtn))
                .addGap(27, 27, 27)
                .addComponent(farmerNameLbl)
                .addGap(18, 18, 18)
                .addComponent(farmerEmailLbl)
                .addGap(18, 18, 18)
                .addComponent(farmerIdLbl)
                .addGap(18, 18, 18)
                .addComponent(farmerPhoneLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(farmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFarmerBtn)
                    .addComponent(editFarmerBtn)
                    .addComponent(deleteFarmerBtn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblFieldType.setText("Type:");

        lblFieldCrop.setText("Crop:");

        lblFieldPlantings.setText("Plantings:");

        javax.swing.GroupLayout fieldsDialogLayout = new javax.swing.GroupLayout(fieldsDialog.getContentPane());
        fieldsDialog.getContentPane().setLayout(fieldsDialogLayout);
        fieldsDialogLayout.setHorizontalGroup(
            fieldsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsDialogLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(fieldsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFieldPlantings)
                    .addComponent(lblFieldCrop)
                    .addComponent(lblFieldType))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        fieldsDialogLayout.setVerticalGroup(
            fieldsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsDialogLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblFieldType)
                .addGap(18, 18, 18)
                .addComponent(lblFieldCrop)
                .addGap(18, 18, 18)
                .addComponent(lblFieldPlantings)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        nameLblAddFarm.setText("Name");

        xLabelAddFarm.setText("x Coord");

        jLabel3.setText("y Coord");

        jLabel4.setText("Type");

        jLabel5.setText("Field ID");

        createFarmBtn.setText("Create Farm");
        createFarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFarmBtnActionPerformed(evt);
            }
        });

        confirmEditBtn.setText("Edit Farm");
        confirmEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditBtnActionPerformed(evt);
            }
        });

        farmCancelBtn.setText("Cancel");
        farmCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmCancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addFarmDialogLayout = new javax.swing.GroupLayout(addFarmDialog.getContentPane());
        addFarmDialog.getContentPane().setLayout(addFarmDialogLayout);
        addFarmDialogLayout.setHorizontalGroup(
            addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFarmDialogLayout.createSequentialGroup()
                .addGroup(addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addFarmDialogLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addFarmDialogLayout.createSequentialGroup()
                                .addComponent(nameLblAddFarm)
                                .addGap(18, 18, 18)
                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addFarmDialogLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(yCoordSpin))
                                .addGroup(addFarmDialogLayout.createSequentialGroup()
                                    .addComponent(xLabelAddFarm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(xCoordSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(addFarmDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addFarmDialogLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(typeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addFarmDialogLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldIdSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addFarmDialogLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(confirmEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(createFarmBtn)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(farmCancelBtn)
                .addGap(46, 46, 46))
        );
        addFarmDialogLayout.setVerticalGroup(
            addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFarmDialogLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLblAddFarm))
                .addGap(18, 18, 18)
                .addGroup(addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xLabelAddFarm)
                    .addComponent(xCoordSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yCoordSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldIdSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(addFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createFarmBtn)
                    .addComponent(confirmEditBtn)
                    .addComponent(farmCancelBtn))
                .addGap(24, 24, 24))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Are You Sure You Want To Delete");

        delFarmNameLbl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        delFarmNameLbl.setText("jLabel7");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("This Decision Is Irreversable");

        ConfirmDelBtn.setText("Confirm");
        ConfirmDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmDelBtnActionPerformed(evt);
            }
        });

        cancelDelBtn.setText("Cancel");
        cancelDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelDelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteFarmDialogLayout = new javax.swing.GroupLayout(deleteFarmDialog.getContentPane());
        deleteFarmDialog.getContentPane().setLayout(deleteFarmDialogLayout);
        deleteFarmDialogLayout.setHorizontalGroup(
            deleteFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteFarmDialogLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(deleteFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(deleteFarmDialogLayout.createSequentialGroup()
                .addGroup(deleteFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteFarmDialogLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(delFarmNameLbl))
                    .addGroup(deleteFarmDialogLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(ConfirmDelBtn)
                        .addGap(87, 87, 87)
                        .addComponent(cancelDelBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteFarmDialogLayout.setVerticalGroup(
            deleteFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteFarmDialogLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delFarmNameLbl)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(deleteFarmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmDelBtn)
                    .addComponent(cancelDelBtn))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLabel1.setText("Name");

        jLabel8.setText("Type");

        jLabel9.setText("Field No.");

        jLabel10.setText("Crop");

        jLabel11.setText("Crop Area");

        confirmAddBtn.setText("Add Field");
        confirmAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit Field");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addFieldDialogLayout = new javax.swing.GroupLayout(addFieldDialog.getContentPane());
        addFieldDialog.getContentPane().setLayout(addFieldDialogLayout);
        addFieldDialogLayout.setHorizontalGroup(
            addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFieldDialogLayout.createSequentialGroup()
                .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addFieldDialogLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addFieldDialogLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addGroup(addFieldDialogLayout.createSequentialGroup()
                                .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addFieldDialogLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addFieldNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(addFieldType)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addFieldDialogLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(addFieldCrop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(addFieldDialogLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmAddBtn)
                        .addGap(47, 47, 47)
                        .addComponent(cancelBtn)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        addFieldDialogLayout.setVerticalGroup(
            addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFieldDialogLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(addFieldType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(addFieldNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(addFieldCrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(addFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(addFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmAddBtn)
                    .addComponent(editBtn)
                    .addComponent(cancelBtn))
                .addGap(22, 22, 22))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Are You Sure You Want To Delete");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("This Decision Is Irreversable");

        fieldNameLbl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        fieldNameLbl.setText("jLabel14");

        confirmFieldDelete.setText("Confirm");
        confirmFieldDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmFieldDeleteActionPerformed(evt);
            }
        });

        cancelFieldDelete.setText("Cancel");
        cancelFieldDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelFieldDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteFieldDialogLayout = new javax.swing.GroupLayout(deleteFieldDialog.getContentPane());
        deleteFieldDialog.getContentPane().setLayout(deleteFieldDialogLayout);
        deleteFieldDialogLayout.setHorizontalGroup(
            deleteFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteFieldDialogLayout.createSequentialGroup()
                .addGroup(deleteFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteFieldDialogLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteFieldDialogLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(fieldNameLbl))
                    .addGroup(deleteFieldDialogLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(deleteFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deleteFieldDialogLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(confirmFieldDelete)
                                .addGap(76, 76, 76)
                                .addComponent(cancelFieldDelete))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        deleteFieldDialogLayout.setVerticalGroup(
            deleteFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteFieldDialogLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fieldNameLbl)
                .addGap(28, 28, 28)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(deleteFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmFieldDelete)
                    .addComponent(cancelFieldDelete))
                .addGap(34, 34, 34))
        );

        jLabel14.setText("Name");

        jLabel15.setText("Email");

        jLabel16.setText("Phone");

        jLabel17.setText("ID");

        confirmAddFarmerBtn.setText("Add Farmer");
        confirmAddFarmerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddFarmerBtnActionPerformed(evt);
            }
        });

        confirmEditFarmerBtn.setText("Edit Farmer");

        cancelAddFarmerBtn.setText("Cancel");

        javax.swing.GroupLayout addFarmerDialogLayout = new javax.swing.GroupLayout(addFarmerDialog.getContentPane());
        addFarmerDialog.getContentPane().setLayout(addFarmerDialogLayout);
        addFarmerDialogLayout.setHorizontalGroup(
            addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFarmerDialogLayout.createSequentialGroup()
                .addGroup(addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addFarmerDialogLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addFarmerDialogLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(addFarmerName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addFarmerDialogLayout.createSequentialGroup()
                                .addGroup(addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addFarmerPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(addFarmerEmail)
                                    .addComponent(addFarmerId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(addFarmerDialogLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(confirmEditFarmerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmAddFarmerBtn)
                        .addGap(34, 34, 34)
                        .addComponent(cancelAddFarmerBtn)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        addFarmerDialogLayout.setVerticalGroup(
            addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFarmerDialogLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(addFarmerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(addFarmerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(addFarmerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(addFarmerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(addFarmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmAddFarmerBtn)
                    .addComponent(confirmEditFarmerBtn)
                    .addComponent(cancelAddFarmerBtn))
                .addGap(36, 36, 36))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbFarms.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        farmsLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        farmsLbl.setText("Farms");
        farmsLbl.setName(""); // NOI18N

        showFarmsBtn.setText("Show Selected Farm");
        showFarmsBtn.setMaximumSize(new java.awt.Dimension(101, 23));
        showFarmsBtn.setMinimumSize(new java.awt.Dimension(101, 23));
        showFarmsBtn.setPreferredSize(new java.awt.Dimension(101, 23));
        showFarmsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFarmsBtnActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        menuLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        menuLbl.setText("Menu");

        addFarmBtn.setText("Add Farm");
        addFarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFarmBtnActionPerformed(evt);
            }
        });

        editFarmBtn.setText("Edit Farm");
        editFarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFarmBtnActionPerformed(evt);
            }
        });

        delFarmBtn.setText("Delete Farm");
        delFarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delFarmBtnActionPerformed(evt);
            }
        });

        viewFarmersBtn.setText("View Farmers");
        viewFarmersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFarmersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(farmsLbl)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbFarms, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(showFarmsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(menuLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(editFarmBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(delFarmBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addFarmBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addComponent(viewFarmersBtn)))
                        .addGap(0, 418, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(farmsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFarms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showFarmsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFarmBtn)
                    .addComponent(viewFarmersBtn))
                .addGap(18, 18, 18)
                .addComponent(editFarmBtn)
                .addGap(18, 18, 18)
                .addComponent(delFarmBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        FileOutputStream fOut = null;
        try {
            fOut = new FileOutputStream("Farms.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fOut);

            objOut.writeObject(objOut);

            objOut.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fOut.close();
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void showFarmsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFarmsBtnActionPerformed
        cmbFields.removeAllItems();
        String tmp = cmbFarms.getSelectedItem().toString();
        Farm tmpFarm = theFarms.getFarmByName(tmp);
        for (int i = 0; i < tmpFarm.getAllFields().length; i++) {
            cmbFields.addItem(tmpFarm.getAllFields()[i].getName());
        }
        showFarmView();
    }//GEN-LAST:event_showFarmsBtnActionPerformed

    private void addFarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFarmBtnActionPerformed
        // TODO add your handling code here:
        confirmEditBtn.setVisible(false);
        createFarmBtn.setVisible(true);
        addFarmDialog.pack();
        addFarmDialog.setVisible(true);
    }//GEN-LAST:event_addFarmBtnActionPerformed

    private void createFarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFarmBtnActionPerformed
        // TODO add your handling code here:
        String name = nameInput.getText();
        int x = (int) xCoordSpin.getValue();
        int y = (int) yCoordSpin.getValue();
        String type = typeInput.getText();
        int id = (int) fieldIdSpin.getValue();
        theFarms.addFarm(name, new Location(x, y, type), id);
        cmbFarms.removeAllItems();
        for (int i = 0; i < theFarms.getAllFarms().size(); i++) {
            cmbFarms.addItem(theFarms.getAllFarms().get(i).getName());
        }
        addFarmDialog.setVisible(false);
        nameInput.setText("");
        xCoordSpin.setValue(0);
        yCoordSpin.setValue(0);
        typeInput.setText("");
        fieldIdSpin.setValue(0);

    }//GEN-LAST:event_createFarmBtnActionPerformed

    private void editFarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFarmBtnActionPerformed
        // TODO add your handling code here:
        confirmEditBtn.setVisible(true);
        createFarmBtn.setVisible(false);
        Farm tmp = theFarms.getFarmByName(cmbFarms.getSelectedItem().toString());
        nameInput.setText(tmp.getName());
        xCoordSpin.setValue(tmp.getLocation().getXCoord());
        yCoordSpin.setValue(tmp.getLocation().getYCoord());
        typeInput.setText(tmp.getLocation().getType());
        fieldIdSpin.setValue(tmp.getFarmNo());
        addFarmDialog.pack();
        addFarmDialog.setVisible(true);
    }//GEN-LAST:event_editFarmBtnActionPerformed

    private void confirmEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditBtnActionPerformed
        // TODO add your handling code here:
        String name = nameInput.getText();
        int x = (int) xCoordSpin.getValue();
        int y = (int) yCoordSpin.getValue();
        String type = typeInput.getText();
        int id = (int) fieldIdSpin.getValue();
        Farm tmp = theFarms.getFarmByName(cmbFarms.getSelectedItem().toString());
        tmp.updateFarmInfo(name, new Location(x, y, type), id);
        cmbFarms.removeAllItems();
        for (int i = 0; i < theFarms.getAllFarms().size(); i++) {
            cmbFarms.addItem(theFarms.getAllFarms().get(i).getName());
        }
        addFarmDialog.setVisible(false);
        nameInput.setText("");
        xCoordSpin.setValue(0);
        yCoordSpin.setValue(0);
        typeInput.setText("");
        fieldIdSpin.setValue(0);
    }//GEN-LAST:event_confirmEditBtnActionPerformed

    private void farmCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmCancelBtnActionPerformed
        // TODO add your handling code here:
        addFarmDialog.setVisible(false);
        nameInput.setText("");
        xCoordSpin.setValue(0);
        yCoordSpin.setValue(0);
        typeInput.setText("");
        fieldIdSpin.setValue(0);
    }//GEN-LAST:event_farmCancelBtnActionPerformed

    private void delFarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delFarmBtnActionPerformed
        // TODO add your handling code here:
        delFarmNameLbl.setText(cmbFarms.getSelectedItem().toString());
        deleteFarmDialog.pack();
        deleteFarmDialog.setVisible(true);
    }//GEN-LAST:event_delFarmBtnActionPerformed

    private void ConfirmDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmDelBtnActionPerformed
        // TODO add your handling code here:
        Farm tmp = theFarms.getFarmByName(cmbFarms.getSelectedItem().toString());
        theFarms.removeFarm(tmp);
        cmbFarms.removeAllItems();
        for (int i = 0; i < theFarms.getAllFarms().size(); i++) {
            cmbFarms.addItem(theFarms.getAllFarms().get(i).getName());
        }
        deleteFarmDialog.setVisible(false);
    }//GEN-LAST:event_ConfirmDelBtnActionPerformed

    private void cancelDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelDelBtnActionPerformed
        // TODO add your handling code here:
        deleteFarmDialog.setVisible(false);
    }//GEN-LAST:event_cancelDelBtnActionPerformed

    private void addFieldBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFieldBtnActionPerformed
        // TODO add your handling code here:
        confirmAddBtn.setVisible(true);
        editBtn.setVisible(false);
        addFieldDialog.pack();
        addFieldDialog.setVisible(true);
    }//GEN-LAST:event_addFieldBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        String name = addFieldName.getText();
        String type = addFieldType.getText();
        int fieldNo = (int) addFieldNo.getValue();
        String crop = addFieldCrop.getText();
        float area;
        if (addFieldArea.getValue() instanceof Float) {
            area = (float) addFieldArea.getValue();

        } else {
            int area1 = (int) addFieldArea.getValue();
            area = (float) area1;
        }
        Farm tmp = theFarms.getFarmByName(cmbFarms.getSelectedItem().toString());
        Field tmpField = tmp.getFieldByName(cmbFields.getSelectedItem().toString());
        tmpField.updateFieldInfo(name, type, fieldNo, crop, area);
        cmbFields.removeAllItems();
        for (int i = 0; i < tmp.getAllFields().length; i++) {
            cmbFields.addItem(tmp.getAllFields()[i].getName());
        }
        addFieldDialog.setVisible(false);
        addFieldName.setText("");
        addFieldType.setText("");
        addFieldNo.setValue(0);
        addFieldCrop.setText("");
        addFieldArea.setValue(0);
    }//GEN-LAST:event_editBtnActionPerformed

    private void editFieldBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFieldBtnActionPerformed
        // TODO add your handling code here:
        Farm tmp = theFarms.getFarmByName(cmbFarms.getSelectedItem().toString());
        Field tmpField = tmp.getFieldByName(cmbFields.getSelectedItem().toString());
        addFieldName.setText(tmpField.getName());
        addFieldType.setText(tmpField.getType());
        addFieldNo.setValue(tmpField.getFieldNumber());
        addFieldCrop.setText(tmpField.getCrop().getName());
        addFieldArea.setValue(tmpField.getCrop().getAreaRequired());
        confirmAddBtn.setVisible(false);
        editBtn.setVisible(true);
        addFieldDialog.pack();
        addFieldDialog.setVisible(true);
    }//GEN-LAST:event_editFieldBtnActionPerformed

    private void confirmAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddBtnActionPerformed
        // TODO add your handling code here:
        String name = addFieldName.getText();
        String type = addFieldType.getText();
        int fieldNo = (int) addFieldNo.getValue();
        String crop = addFieldCrop.getText();
        float area = ((int) addFieldArea.getValue() / (float) 1);
        Farm tmp = theFarms.getFarmByName(cmbFarms.getSelectedItem().toString());
        tmp.addField(name, type, fieldNo, crop, area);
        cmbFields.removeAllItems();
        for (int i = 0; i < tmp.getAllFields().length; i++) {
            cmbFields.addItem(tmp.getAllFields()[i].getName());
        }
        addFieldDialog.setVisible(false);
        addFieldName.setText("");
        addFieldType.setText("");
        addFieldNo.setValue(0);
        addFieldCrop.setText("");
        addFieldArea.setValue(0);
    }//GEN-LAST:event_confirmAddBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        addFieldDialog.setVisible(false);
        addFieldName.setText("");
        addFieldType.setText("");
        addFieldNo.setValue(0);
        addFieldCrop.setText("");
        addFieldArea.setValue(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void removeFieldBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFieldBtnActionPerformed
        // TODO add your handling code here:
        fieldNameLbl.setText(cmbFields.getSelectedItem().toString());
        deleteFieldDialog.pack();
        deleteFieldDialog.setVisible(true);
    }//GEN-LAST:event_removeFieldBtnActionPerformed

    private void cancelFieldDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelFieldDeleteActionPerformed
        // TODO add your handling code here:
        fieldNameLbl.setText("No field Selected");
        deleteFieldDialog.setVisible(false);
    }//GEN-LAST:event_cancelFieldDeleteActionPerformed

    private void confirmFieldDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmFieldDeleteActionPerformed
        // TODO add your handling code here:
        Farm tmp = theFarms.getFarmByName(cmbFarms.getSelectedItem().toString());
        tmp.removeField(tmp.getFieldByName(cmbFields.getSelectedItem().toString()).getFieldNumber());
        cmbFields.removeAllItems();
        for (int i = 0; i < tmp.getAllFields().length; i++) {
            cmbFields.addItem(tmp.getAllFields()[i].getName());
        }
        deleteFieldDialog.setVisible(false);
    }//GEN-LAST:event_confirmFieldDeleteActionPerformed

    private void createFarmerTable(String farmerName) {
        
        SetOfFarms tmp = theFarmers.getFarmerByName(farmerName).getAssociatedFarms();
        Object[] data = new Object[1];
        DefaultTableModel model = (DefaultTableModel) farmerTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < tmp.getAllFarms().size(); i++) {
            data[0] = tmp.getAllFarms().get(i).getName();
            model.addRow(data);
        } 
    }

    private void viewFarmersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFarmersBtnActionPerformed
        // TODO add your handling code here:
        cmbFarmers.removeAllItems();
        for (int i = 0; i < theFarmers.getAllFarmers().length; i++) {
            cmbFarmers.addItem(theFarmers.getAllFarmers()[i].getName());
        };
        farmerDialog.pack();
        farmerDialog.setVisible(true);
    }//GEN-LAST:event_viewFarmersBtnActionPerformed

    private void showFarmerDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFarmerDetailsBtnActionPerformed
        // TODO add your handling code here:
        Farmer tmp = theFarmers.getFarmerByName(cmbFarmers.getSelectedItem().toString());
        farmerNameLbl.setText("Farmer Name: " + tmp.getName());
        farmerEmailLbl.setText("Farmer Email: " + tmp.getEmail());
        farmerIdLbl.setText("Farmer ID: " + tmp.getId());
        farmerPhoneLbl.setText("Farmer Phone: " + tmp.getTelephone());
        createFarmerTable(tmp.getName());
    }//GEN-LAST:event_showFarmerDetailsBtnActionPerformed

    private void addFarmerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFarmerBtnActionPerformed
        // TODO add your handling code here:
        confirmAddFarmerBtn.setVisible(true);
        confirmEditFarmerBtn.setVisible(false);
        addFarmerDialog.pack();
        addFarmerDialog.setVisible(true);
    }//GEN-LAST:event_addFarmerBtnActionPerformed

    private void editFarmerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFarmerBtnActionPerformed
        // TODO add your handling code here:
        confirmAddFarmerBtn.setVisible(false);
        confirmEditFarmerBtn.setVisible(true);
        addFarmerDialog.pack();
        addFarmerDialog.setVisible(true);
    }//GEN-LAST:event_editFarmerBtnActionPerformed

    private void confirmAddFarmerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddFarmerBtnActionPerformed
        // TODO add your handling code here:
        String name = addFarmerName.getText();
        String email = addFarmerEmail.getText();
        String phone = addFarmerPhone.getText();
        int id = (int) addFarmerId.getValue();
        theFarmers.addFarmer(name, email, phone, id, new SetOfFarms());
        cmbFarmers.removeAllItems();
        for (int i = 0; i < theFarmers.getAllFarmers().length; i++) {
            cmbFarmers.addItem(theFarmers.getAllFarmers()[i].getName());
        };
        addFarmerDialog.setVisible(false);
    }//GEN-LAST:event_confirmAddFarmerBtnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmDelBtn;
    private javax.swing.JButton addFarmBtn;
    private javax.swing.JDialog addFarmDialog;
    private javax.swing.JButton addFarmerBtn;
    private javax.swing.JDialog addFarmerDialog;
    private javax.swing.JTextField addFarmerEmail;
    private javax.swing.JSpinner addFarmerId;
    private javax.swing.JTextField addFarmerName;
    private javax.swing.JTextField addFarmerPhone;
    private javax.swing.JSpinner addFieldArea;
    private javax.swing.JButton addFieldBtn;
    private javax.swing.JTextField addFieldCrop;
    private javax.swing.JDialog addFieldDialog;
    private javax.swing.JTextField addFieldName;
    private javax.swing.JSpinner addFieldNo;
    private javax.swing.JTextField addFieldType;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton cancelAddFarmerBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton cancelDelBtn;
    private javax.swing.JButton cancelFieldDelete;
    private javax.swing.JComboBox<String> cmbFarmers;
    private javax.swing.JComboBox cmbFarms;
    private javax.swing.JComboBox cmbFields;
    private javax.swing.JButton confirmAddBtn;
    private javax.swing.JButton confirmAddFarmerBtn;
    private javax.swing.JButton confirmEditBtn;
    private javax.swing.JButton confirmEditFarmerBtn;
    private javax.swing.JButton confirmFieldDelete;
    private javax.swing.JButton createFarmBtn;
    private javax.swing.JButton delFarmBtn;
    private javax.swing.JLabel delFarmNameLbl;
    private javax.swing.JDialog deleteFarmDialog;
    private javax.swing.JButton deleteFarmerBtn;
    private javax.swing.JDialog deleteFieldDialog;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton editFarmBtn;
    private javax.swing.JButton editFarmerBtn;
    private javax.swing.JButton editFieldBtn;
    private javax.swing.JButton farmCancelBtn;
    private javax.swing.JDialog farmView;
    private javax.swing.JDialog farmerDialog;
    private javax.swing.JLabel farmerEmailLbl;
    private javax.swing.JLabel farmerIdLbl;
    private javax.swing.JLabel farmerNameLbl;
    private javax.swing.JLabel farmerPhoneLbl;
    private javax.swing.JTable farmerTable;
    private javax.swing.JLabel farmsLbl;
    private javax.swing.JSpinner fieldIdSpin;
    private javax.swing.JLabel fieldLbl;
    private javax.swing.JLabel fieldNameLbl;
    private javax.swing.JDialog fieldsDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblFieldCrop;
    private javax.swing.JLabel lblFieldPlantings;
    private javax.swing.JLabel lblFieldType;
    private javax.swing.JLabel menuLbl;
    private javax.swing.JLabel menuLbl1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLblAddFarm;
    private javax.swing.JButton removeFieldBtn;
    private javax.swing.JButton showFarmerDetailsBtn;
    private javax.swing.JButton showFarmsBtn;
    private javax.swing.JButton showFieldBtn;
    private javax.swing.JTextField typeInput;
    private javax.swing.JButton viewFarmersBtn;
    private javax.swing.JSpinner xCoordSpin;
    private javax.swing.JLabel xLabelAddFarm;
    private javax.swing.JSpinner yCoordSpin;
    // End of variables declaration//GEN-END:variables

}
