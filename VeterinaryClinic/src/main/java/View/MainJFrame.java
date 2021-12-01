/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.lang.Runnable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;
import javax.swing.table.*;
import javax.swing.table.TableColumn;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Controller.Controller;
import View.GenericTableModel;

import View.Treatment.DeleteTreatmentJDialog;
import View.Treatment.EditTreatmentJDialog;
import View.Treatment.NewTreatmentJDialog;
import View.Treatment.SeeTreatmentJDialog;
import Models.Treatment;
import Models.DAO.TreatmentDAO;
import Controller.ControllerTreatment;

import View.Consultation.DeleteConsultationJDialog;
import View.Consultation.EditConsultationJDialog;
import View.Consultation.NewConsultationJDialog;
import View.Consultation.SeeConsultationJDialog;
import Models.Consultation;
import Models.DAO.ConsultationDAO;
import Controller.ControllerConsultation;

import View.Exam.DeleteExamJDialog;
import View.Exam.EditExamJDialog;
import View.Exam.NewExamJDialog;
import View.Exam.SeeExamJDialog;
import Models.Exam;
import Models.DAO.ExamDAO;
import Controller.ControllerExam;

import Controller.ControllerAnimal;

import View.Client.DeleteClientJDialog;
import View.Client.EditClientJDialog;
import View.Client.NewClientJDialog;
import View.Client.SeeClientJDialog;
import View.Client.ClientTableModel;
import Controller.ControllerClient;

import View.Vet.DeleteVetJDialog;
import View.Vet.EditVetJDialog;
import View.Vet.NewVetJDialog;
import View.Vet.SeeVetJDialog;
import Models.Vet;
import Models.DAO.VetDAO;
import Controller.ControllerVet;

/**
 *
 * @author mateu
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private View.TableComponentsCollection tableComponentsCollection = new View.TableComponentsCollection();
    private javax.swing.JButton initialTableBarButton;
    
    /** Creates new form MainJFrame */
    public MainJFrame() { 
        initComponents();
        this.setTableComponentsCollection();
        Controller.addJTablesSelectionRowEvents(this.tableComponentsCollection);
        Controller.setEmptyAllJTables(this.tableComponentsCollection);
        this.setInitialTableBarButton();
        this.clickInitialTableBarButton();
        this.removeEditAndDeleteButtons();
    }
    
    private void setTableComponentsCollection() {
        this.tableComponentsCollection.addTableComponents(new View.TableComponents("Treatments",this.jPanelTreatments,this.jTableTreatments,this.jButtonSeeTreatment,this.jButtonEditTreatment,this.jButtonDeleteTreatment,this.jButtonNewTreatment));
        this.tableComponentsCollection.addTableComponents(new View.TableComponents("Consultations",this.jPanelConsultations,this.jTableConsultations,this.jButtonSeeConsultation,this.jButtonEditConsultation,this.jButtonDeleteConsultation,this.jButtonNewConsultation));
        this.tableComponentsCollection.addTableComponents(new View.TableComponents("Exams",this.jPanelExams,this.jTableExams,this.jButtonSeeExam,this.jButtonEditExam,this.jButtonDeleteExam,this.jButtonNewExam));
        this.tableComponentsCollection.addTableComponents(new View.TableComponents("Animals",this.jPanelAnimals,this.jTableAnimals,this.jButtonSeeAnimal,this.jButtonEditAnimal,this.jButtonDeleteAnimal,this.jButtonNewAnimal));
        this.tableComponentsCollection.addTableComponents(new View.TableComponents("Clients",this.jPanelClients,this.jTableClients,this.jButtonSeeClient,this.jButtonEditClient,this.jButtonDeleteClient,this.jButtonNewClient));
        this.tableComponentsCollection.addTableComponents(new View.TableComponents("Vets",this.jPanelVets,this.jTableVets,this.jButtonSeeVet,this.jButtonEditVet,this.jButtonDeleteVet,this.jButtonNewVet));
    }
    
    private void setInitialTableBarButton() {
        this.initialTableBarButton = jButtonMenuBarTreatments;
    }
    
    private void clickInitialTableBarButton() {
        this.initialTableBarButton.doClick();
    }
    
    public TableComponentsCollection getTableComponentsCollection() {
        return this.tableComponentsCollection;
    }
    public TableComponents getTableComponentsTreatments() {
        return this.tableComponentsCollection.getTableComponentsById("Treatments");
    }
    public TableComponents getTableComponentsConsultations() {
        return this.tableComponentsCollection.getTableComponentsById("Consultations");
    }
    public TableComponents getTableComponentsExams() {
        return this.tableComponentsCollection.getTableComponentsById("Exams");
    }
    public TableComponents getTableComponentsAnimals() {
        return this.tableComponentsCollection.getTableComponentsById("Animals");
    }
    public TableComponents getTableComponentsClients() {
        return this.tableComponentsCollection.getTableComponentsById("Clients");
    }
    public TableComponents getTableComponentsVets() {
        return this.tableComponentsCollection.getTableComponentsById("Vets");
    }
    
    private void removeEditAndDeleteButtons() {
        this.jPanelActionsAnimals.remove(this.jButtonEditAnimal);
        this.jPanelActionsAnimals.remove(this.jButtonDeleteAnimal);
        this.jPanelActionsClients.remove(this.jButtonEditClient);
        this.jPanelActionsClients.remove(this.jButtonDeleteClient);
        this.jPanelActionsTreatments.remove(this.jButtonEditTreatment);
        this.jPanelActionsTreatments.remove(this.jButtonDeleteTreatment);
        this.jPanelActionsVets.remove(this.jButtonEditVet);
        this.jPanelActionsVets.remove(this.jButtonDeleteVet);
        this.jPanelActionsConsultations.remove(this.jButtonEditConsultation);
        this.jPanelActionsConsultations.remove(this.jButtonDeleteConsultation);
        this.jPanelActionsExams.remove(this.jButtonEditExam);
        this.jPanelActionsExams.remove(this.jButtonDeleteExam);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuBar = new javax.swing.JPanel();
        jButtonMenuBarTreatments = new javax.swing.JButton();
        jButtonMenuBarConsultations = new javax.swing.JButton();
        jButtonMenuBarExams = new javax.swing.JButton();
        jButtonMenuBarAnimals = new javax.swing.JButton();
        jButtonMenuBarClients = new javax.swing.JButton();
        jButtonMenuBarVets = new javax.swing.JButton();
        jPanelContentBackground = new javax.swing.JPanel();
        jPanelTreatments = new javax.swing.JPanel();
        jScrollPaneTreatments = new javax.swing.JScrollPane();
        jTableTreatments = new javax.swing.JTable();
        jButtonNewTreatment = new javax.swing.JButton();
        jPanelActionsTreatments = new javax.swing.JPanel();
        jButtonSeeTreatment = new javax.swing.JButton();
        jButtonEditTreatment = new javax.swing.JButton();
        jButtonDeleteTreatment = new javax.swing.JButton();
        jPanelConsultations = new javax.swing.JPanel();
        jScrollPaneConsultations = new javax.swing.JScrollPane();
        jTableConsultations = new javax.swing.JTable();
        jButtonNewConsultation = new javax.swing.JButton();
        jPanelActionsConsultations = new javax.swing.JPanel();
        jButtonSeeConsultation = new javax.swing.JButton();
        jButtonEditConsultation = new javax.swing.JButton();
        jButtonDeleteConsultation = new javax.swing.JButton();
        jPanelExams = new javax.swing.JPanel();
        jScrollPaneExams = new javax.swing.JScrollPane();
        jTableExams = new javax.swing.JTable();
        jButtonNewExam = new javax.swing.JButton();
        jPanelActionsExams = new javax.swing.JPanel();
        jButtonSeeExam = new javax.swing.JButton();
        jButtonEditExam = new javax.swing.JButton();
        jButtonDeleteExam = new javax.swing.JButton();
        jPanelAnimals = new javax.swing.JPanel();
        jScrollPaneAnimals = new javax.swing.JScrollPane();
        jTableAnimals = new javax.swing.JTable();
        jButtonNewAnimal = new javax.swing.JButton();
        jPanelActionsAnimals = new javax.swing.JPanel();
        jButtonSeeAnimal = new javax.swing.JButton();
        jButtonEditAnimal = new javax.swing.JButton();
        jButtonDeleteAnimal = new javax.swing.JButton();
        jPanelClients = new javax.swing.JPanel();
        jScrollPaneClients = new javax.swing.JScrollPane();
        jTableClients = new javax.swing.JTable();
        jButtonNewClient = new javax.swing.JButton();
        jPanelActionsClients = new javax.swing.JPanel();
        jButtonSeeClient = new javax.swing.JButton();
        jButtonEditClient = new javax.swing.JButton();
        jButtonDeleteClient = new javax.swing.JButton();
        jPanelVets = new javax.swing.JPanel();
        jScrollPaneVets = new javax.swing.JScrollPane();
        jTableVets = new javax.swing.JTable();
        jButtonNewVet = new javax.swing.JButton();
        jPanelActionsVets = new javax.swing.JPanel();
        jButtonSeeVet = new javax.swing.JButton();
        jButtonEditVet = new javax.swing.JButton();
        jButtonDeleteVet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veterinary Clinic Application");
        setBackground(java.awt.Color.darkGray);
        setForeground(java.awt.Color.darkGray);
        setMinimumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 1000));

        jPanelMenuBar.setBackground(java.awt.Color.darkGray);
        jPanelMenuBar.setForeground(java.awt.Color.white);

        jButtonMenuBarTreatments.setBackground(jPanelMenuBar.getBackground());
        jButtonMenuBarTreatments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMenuBarTreatments.setForeground(jPanelMenuBar.getForeground());
        jButtonMenuBarTreatments.setText("Treatments");
        jButtonMenuBarTreatments.setBorderPainted(false);
        jButtonMenuBarTreatments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuBarTreatments.setRolloverEnabled(false);
        jButtonMenuBarTreatments.setVerifyInputWhenFocusTarget(false);
        jButtonMenuBarTreatments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBarTreatmentsActionPerformed(evt);
            }
        });

        jButtonMenuBarConsultations.setBackground(jPanelMenuBar.getBackground());
        jButtonMenuBarConsultations.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMenuBarConsultations.setForeground(jPanelMenuBar.getForeground());
        jButtonMenuBarConsultations.setText("Consultations");
        jButtonMenuBarConsultations.setBorderPainted(false);
        jButtonMenuBarConsultations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuBarConsultations.setRolloverEnabled(false);
        jButtonMenuBarConsultations.setVerifyInputWhenFocusTarget(false);
        jButtonMenuBarConsultations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBarConsultationsActionPerformed(evt);
            }
        });

        jButtonMenuBarExams.setBackground(jPanelMenuBar.getBackground());
        jButtonMenuBarExams.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMenuBarExams.setForeground(jPanelMenuBar.getForeground());
        jButtonMenuBarExams.setText("Exams");
        jButtonMenuBarExams.setBorderPainted(false);
        jButtonMenuBarExams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuBarExams.setRolloverEnabled(false);
        jButtonMenuBarExams.setVerifyInputWhenFocusTarget(false);
        jButtonMenuBarExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBarExamsActionPerformed(evt);
            }
        });

        jButtonMenuBarAnimals.setBackground(jPanelMenuBar.getBackground());
        jButtonMenuBarAnimals.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMenuBarAnimals.setForeground(jPanelMenuBar.getForeground());
        jButtonMenuBarAnimals.setText("Animals");
        jButtonMenuBarAnimals.setBorderPainted(false);
        jButtonMenuBarAnimals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuBarAnimals.setRolloverEnabled(false);
        jButtonMenuBarAnimals.setVerifyInputWhenFocusTarget(false);
        jButtonMenuBarAnimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBarAnimalsActionPerformed(evt);
            }
        });

        jButtonMenuBarClients.setBackground(jPanelMenuBar.getBackground());
        jButtonMenuBarClients.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMenuBarClients.setForeground(jPanelMenuBar.getForeground());
        jButtonMenuBarClients.setText("Clients");
        jButtonMenuBarClients.setBorderPainted(false);
        jButtonMenuBarClients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuBarClients.setRolloverEnabled(false);
        jButtonMenuBarClients.setVerifyInputWhenFocusTarget(false);
        jButtonMenuBarClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBarClientsActionPerformed(evt);
            }
        });

        jButtonMenuBarVets.setBackground(jPanelMenuBar.getBackground());
        jButtonMenuBarVets.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMenuBarVets.setForeground(jPanelMenuBar.getForeground());
        jButtonMenuBarVets.setText("Vets");
        jButtonMenuBarVets.setBorderPainted(false);
        jButtonMenuBarVets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuBarVets.setRolloverEnabled(false);
        jButtonMenuBarVets.setVerifyInputWhenFocusTarget(false);
        jButtonMenuBarVets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBarVetsActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelMenuBarLayout = new org.jdesktop.layout.GroupLayout(jPanelMenuBar);
        jPanelMenuBar.setLayout(jPanelMenuBarLayout);
        jPanelMenuBarLayout.setHorizontalGroup(
            jPanelMenuBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelMenuBarLayout.createSequentialGroup()
                .add(jButtonMenuBarTreatments)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonMenuBarConsultations)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonMenuBarExams)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonMenuBarAnimals)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonMenuBarClients)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonMenuBarVets)
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanelMenuBarLayout.setVerticalGroup(
            jPanelMenuBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelMenuBarLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelMenuBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButtonMenuBarExams)
                    .add(jButtonMenuBarAnimals)
                    .add(jButtonMenuBarClients)
                    .add(jButtonMenuBarVets)))
            .add(jButtonMenuBarConsultations)
            .add(jButtonMenuBarTreatments)
        );

        jPanelContentBackground.setName(""); // NOI18N
        jPanelContentBackground.setOpaque(false);
        jPanelContentBackground.setLayout(new java.awt.CardLayout());

        jPanelTreatments.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTreatments.setPreferredSize(new java.awt.Dimension(407, 200));

        jTableTreatments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableTreatments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Treatment 1", "2021-09-01", "2021-09-02", "Foguinho",  new Boolean(true)},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "object", "Name", "Start", "End", "Animal", "Finished"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTreatments.setIntercellSpacing(new java.awt.Dimension(2, 4));
        jTableTreatments.setSelectionBackground(java.awt.Color.lightGray);
        jTableTreatments.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableTreatments.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableTreatments.setShowGrid(true);
        jTableTreatments.getTableHeader().setResizingAllowed(false);
        jTableTreatments.getTableHeader().setReorderingAllowed(false);
        jScrollPaneTreatments.setViewportView(jTableTreatments);

        jButtonNewTreatment.setText("New Treatment");
        jButtonNewTreatment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewTreatmentActionPerformed(evt);
            }
        });

        jPanelActionsTreatments.setBackground(jPanelTreatments.getBackground());

        jButtonSeeTreatment.setText("See");
        jButtonSeeTreatment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeTreatmentActionPerformed(evt);
            }
        });

        jButtonEditTreatment.setText("Edit");
        jButtonEditTreatment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditTreatmentActionPerformed(evt);
            }
        });

        jButtonDeleteTreatment.setText("Delete");
        jButtonDeleteTreatment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteTreatmentActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelActionsTreatmentsLayout = new org.jdesktop.layout.GroupLayout(jPanelActionsTreatments);
        jPanelActionsTreatments.setLayout(jPanelActionsTreatmentsLayout);
        jPanelActionsTreatmentsLayout.setHorizontalGroup(
            jPanelActionsTreatmentsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelActionsTreatmentsLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelActionsTreatmentsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonEditTreatment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonDeleteTreatment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButtonSeeTreatment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelActionsTreatmentsLayout.setVerticalGroup(
            jPanelActionsTreatmentsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelActionsTreatmentsLayout.createSequentialGroup()
                .add(jButtonSeeTreatment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonEditTreatment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonDeleteTreatment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout jPanelTreatmentsLayout = new org.jdesktop.layout.GroupLayout(jPanelTreatments);
        jPanelTreatments.setLayout(jPanelTreatmentsLayout);
        jPanelTreatmentsLayout.setHorizontalGroup(
            jPanelTreatmentsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelTreatmentsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelTreatmentsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelTreatmentsLayout.createSequentialGroup()
                        .add(jScrollPaneTreatments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelActionsTreatments, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelTreatmentsLayout.createSequentialGroup()
                        .add(jButtonNewTreatment)
                        .add(0, 280, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTreatmentsLayout.setVerticalGroup(
            jPanelTreatmentsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelTreatmentsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelTreatmentsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPaneTreatments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .add(jPanelTreatmentsLayout.createSequentialGroup()
                        .add(jPanelActionsTreatments, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonNewTreatment)
                .addContainerGap())
        );

        jPanelContentBackground.add(jPanelTreatments, "card2");

        jPanelConsultations.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConsultations.setPreferredSize(new java.awt.Dimension(407, 200));

        jTableConsultations.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableConsultations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "2021-09-04T09:00", "Tratamento 1", "Vet1", "Consultation 1 - Treatment 1 - Vet 1",  new Boolean(true)},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "object", "Date", "Treatment", "Vet", "Comment", "Finished"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultations.setIntercellSpacing(new java.awt.Dimension(2, 4));
        jTableConsultations.setSelectionBackground(java.awt.Color.lightGray);
        jTableConsultations.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableConsultations.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableConsultations.setShowGrid(true);
        jTableConsultations.getTableHeader().setResizingAllowed(false);
        jTableConsultations.getTableHeader().setReorderingAllowed(false);
        jScrollPaneConsultations.setViewportView(jTableConsultations);

        jButtonNewConsultation.setText("New Consultation");
        jButtonNewConsultation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewConsultationActionPerformed(evt);
            }
        });

        jPanelActionsConsultations.setBackground(jPanelConsultations.getBackground());

        jButtonSeeConsultation.setText("See");
        jButtonSeeConsultation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeConsultation.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonSeeConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeConsultationActionPerformed(evt);
            }
        });

        jButtonEditConsultation.setText("Edit");
        jButtonEditConsultation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditConsultation.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonEditConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditConsultationActionPerformed(evt);
            }
        });

        jButtonDeleteConsultation.setText("Delete");
        jButtonDeleteConsultation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteConsultationActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelActionsConsultationsLayout = new org.jdesktop.layout.GroupLayout(jPanelActionsConsultations);
        jPanelActionsConsultations.setLayout(jPanelActionsConsultationsLayout);
        jPanelActionsConsultationsLayout.setHorizontalGroup(
            jPanelActionsConsultationsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelActionsConsultationsLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelActionsConsultationsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonEditConsultation, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonDeleteConsultation, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButtonSeeConsultation, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelActionsConsultationsLayout.setVerticalGroup(
            jPanelActionsConsultationsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelActionsConsultationsLayout.createSequentialGroup()
                .add(jButtonSeeConsultation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(7, 7, 7)
                .add(jButtonEditConsultation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonDeleteConsultation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout jPanelConsultationsLayout = new org.jdesktop.layout.GroupLayout(jPanelConsultations);
        jPanelConsultations.setLayout(jPanelConsultationsLayout);
        jPanelConsultationsLayout.setHorizontalGroup(
            jPanelConsultationsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelConsultationsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelConsultationsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelConsultationsLayout.createSequentialGroup()
                        .add(jScrollPaneConsultations, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelActionsConsultations, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelConsultationsLayout.createSequentialGroup()
                        .add(jButtonNewConsultation)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConsultationsLayout.setVerticalGroup(
            jPanelConsultationsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelConsultationsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelConsultationsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPaneConsultations, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(jPanelConsultationsLayout.createSequentialGroup()
                        .add(jPanelActionsConsultations, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonNewConsultation)
                .addContainerGap())
        );

        jPanelContentBackground.add(jPanelConsultations, "card3");

        jPanelExams.setBackground(new java.awt.Color(255, 255, 255));
        jPanelExams.setPreferredSize(new java.awt.Dimension(407, 200));

        jTableExams.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableExams.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Exam1", "Consultation 1 Comment", "Treatment 1"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "object", "Name", "Consultation", "Treatment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableExams.setIntercellSpacing(new java.awt.Dimension(4, 2));
        jTableExams.setSelectionBackground(java.awt.Color.lightGray);
        jTableExams.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableExams.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableExams.setShowGrid(true);
        jTableExams.getTableHeader().setResizingAllowed(false);
        jTableExams.getTableHeader().setReorderingAllowed(false);
        jScrollPaneExams.setViewportView(jTableExams);

        jButtonNewExam.setText("New Exam");
        jButtonNewExam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewExamActionPerformed(evt);
            }
        });

        jPanelActionsExams.setBackground(jPanelConsultations.getBackground());

        jButtonSeeExam.setText("See");
        jButtonSeeExam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeExam.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonSeeExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeExamActionPerformed(evt);
            }
        });

        jButtonEditExam.setText("Edit");
        jButtonEditExam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditExam.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonEditExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditExamActionPerformed(evt);
            }
        });

        jButtonDeleteExam.setText("Delete");
        jButtonDeleteExam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteExamActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelActionsExamsLayout = new org.jdesktop.layout.GroupLayout(jPanelActionsExams);
        jPanelActionsExams.setLayout(jPanelActionsExamsLayout);
        jPanelActionsExamsLayout.setHorizontalGroup(
            jPanelActionsExamsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelActionsExamsLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelActionsExamsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonDeleteExam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonSeeExam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonEditExam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelActionsExamsLayout.setVerticalGroup(
            jPanelActionsExamsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelActionsExamsLayout.createSequentialGroup()
                .add(jButtonSeeExam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(7, 7, 7)
                .add(jButtonEditExam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonDeleteExam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout jPanelExamsLayout = new org.jdesktop.layout.GroupLayout(jPanelExams);
        jPanelExams.setLayout(jPanelExamsLayout);
        jPanelExamsLayout.setHorizontalGroup(
            jPanelExamsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelExamsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelExamsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelExamsLayout.createSequentialGroup()
                        .add(jScrollPaneExams, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelActionsExams, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelExamsLayout.createSequentialGroup()
                        .add(jButtonNewExam)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelExamsLayout.setVerticalGroup(
            jPanelExamsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelExamsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelExamsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPaneExams, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .add(jPanelExamsLayout.createSequentialGroup()
                        .add(jPanelActionsExams, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonNewExam)
                .addContainerGap())
        );

        jPanelContentBackground.add(jPanelExams, "card3");

        jPanelAnimals.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAnimals.setPreferredSize(new java.awt.Dimension(407, 200));

        jTableAnimals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableAnimals.setIntercellSpacing(new java.awt.Dimension(4, 2));
        jTableAnimals.setSelectionBackground(java.awt.Color.lightGray);
        jTableAnimals.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableAnimals.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableAnimals.setShowGrid(true);
        jTableAnimals.getTableHeader().setResizingAllowed(false);
        jTableAnimals.getTableHeader().setReorderingAllowed(false);
        jScrollPaneAnimals.setViewportView(jTableAnimals);

        jButtonNewAnimal.setText("New Animal");
        jButtonNewAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewAnimalActionPerformed(evt);
            }
        });

        jPanelActionsAnimals.setBackground(jPanelConsultations.getBackground());

        jButtonSeeAnimal.setText("See");
        jButtonSeeAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeAnimal.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonSeeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeAnimalActionPerformed(evt);
            }
        });

        jButtonEditAnimal.setText("Edit");
        jButtonEditAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditAnimal.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonEditAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditAnimalActionPerformed(evt);
            }
        });

        jButtonDeleteAnimal.setText("Delete");
        jButtonDeleteAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteAnimalActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelActionsAnimalsLayout = new org.jdesktop.layout.GroupLayout(jPanelActionsAnimals);
        jPanelActionsAnimals.setLayout(jPanelActionsAnimalsLayout);
        jPanelActionsAnimalsLayout.setHorizontalGroup(
            jPanelActionsAnimalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelActionsAnimalsLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelActionsAnimalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonEditAnimal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonDeleteAnimal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButtonSeeAnimal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelActionsAnimalsLayout.setVerticalGroup(
            jPanelActionsAnimalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelActionsAnimalsLayout.createSequentialGroup()
                .add(jButtonSeeAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(7, 7, 7)
                .add(jButtonEditAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonDeleteAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout jPanelAnimalsLayout = new org.jdesktop.layout.GroupLayout(jPanelAnimals);
        jPanelAnimals.setLayout(jPanelAnimalsLayout);
        jPanelAnimalsLayout.setHorizontalGroup(
            jPanelAnimalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelAnimalsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelAnimalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelAnimalsLayout.createSequentialGroup()
                        .add(jScrollPaneAnimals, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelActionsAnimals, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelAnimalsLayout.createSequentialGroup()
                        .add(jButtonNewAnimal)
                        .add(0, 300, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAnimalsLayout.setVerticalGroup(
            jPanelAnimalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelAnimalsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelAnimalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPaneAnimals, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .add(jPanelAnimalsLayout.createSequentialGroup()
                        .add(jPanelActionsAnimals, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonNewAnimal)
                .addContainerGap())
        );

        jPanelContentBackground.add(jPanelAnimals, "card3");

        jPanelClients.setBackground(new java.awt.Color(255, 255, 255));
        jPanelClients.setPreferredSize(new java.awt.Dimension(407, 200));

        jTableClients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableClients.setIntercellSpacing(new java.awt.Dimension(4, 2));
        jTableClients.setSelectionBackground(java.awt.Color.lightGray);
        jTableClients.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableClients.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableClients.setShowGrid(true);
        jTableClients.getTableHeader().setResizingAllowed(false);
        jTableClients.getTableHeader().setReorderingAllowed(false);
        jScrollPaneClients.setViewportView(jTableClients);

        jButtonNewClient.setText("New Client");
        jButtonNewClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewClientActionPerformed(evt);
            }
        });

        jPanelActionsClients.setBackground(jPanelConsultations.getBackground());

        jButtonSeeClient.setText("See");
        jButtonSeeClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeClient.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonSeeClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeClientActionPerformed(evt);
            }
        });

        jButtonEditClient.setText("Edit");
        jButtonEditClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditClient.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonEditClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditClientActionPerformed(evt);
            }
        });

        jButtonDeleteClient.setText("Delete");
        jButtonDeleteClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteClientActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelActionsClientsLayout = new org.jdesktop.layout.GroupLayout(jPanelActionsClients);
        jPanelActionsClients.setLayout(jPanelActionsClientsLayout);
        jPanelActionsClientsLayout.setHorizontalGroup(
            jPanelActionsClientsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelActionsClientsLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelActionsClientsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonDeleteClient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonSeeClient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonEditClient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelActionsClientsLayout.setVerticalGroup(
            jPanelActionsClientsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelActionsClientsLayout.createSequentialGroup()
                .add(jButtonSeeClient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(7, 7, 7)
                .add(jButtonEditClient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonDeleteClient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout jPanelClientsLayout = new org.jdesktop.layout.GroupLayout(jPanelClients);
        jPanelClients.setLayout(jPanelClientsLayout);
        jPanelClientsLayout.setHorizontalGroup(
            jPanelClientsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelClientsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelClientsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelClientsLayout.createSequentialGroup()
                        .add(jScrollPaneClients, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelActionsClients, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelClientsLayout.createSequentialGroup()
                        .add(jButtonNewClient)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelClientsLayout.setVerticalGroup(
            jPanelClientsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelClientsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelClientsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPaneClients, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .add(jPanelClientsLayout.createSequentialGroup()
                        .add(jPanelActionsClients, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonNewClient)
                .addContainerGap())
        );

        jPanelContentBackground.add(jPanelClients, "card3");

        jPanelVets.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVets.setPreferredSize(new java.awt.Dimension(407, 200));

        jTableVets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableVets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Vet 1", "66933334444", "Rua 3"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "object", "Name", "Phone", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVets.setIntercellSpacing(new java.awt.Dimension(4, 2));
        jTableVets.setSelectionBackground(java.awt.Color.lightGray);
        jTableVets.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableVets.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableVets.setShowGrid(true);
        jTableVets.getTableHeader().setResizingAllowed(false);
        jTableVets.getTableHeader().setReorderingAllowed(false);
        jScrollPaneVets.setViewportView(jTableVets);

        jButtonNewVet.setText("New Vet");
        jButtonNewVet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewVetActionPerformed(evt);
            }
        });

        jPanelActionsVets.setBackground(jPanelConsultations.getBackground());

        jButtonSeeVet.setText("See");
        jButtonSeeVet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeVet.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonSeeVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeVetActionPerformed(evt);
            }
        });

        jButtonEditVet.setText("Edit");
        jButtonEditVet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditVet.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonEditVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditVetActionPerformed(evt);
            }
        });

        jButtonDeleteVet.setText("Delete");
        jButtonDeleteVet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteVetActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelActionsVetsLayout = new org.jdesktop.layout.GroupLayout(jPanelActionsVets);
        jPanelActionsVets.setLayout(jPanelActionsVetsLayout);
        jPanelActionsVetsLayout.setHorizontalGroup(
            jPanelActionsVetsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelActionsVetsLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelActionsVetsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonDeleteVet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonSeeVet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonEditVet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelActionsVetsLayout.setVerticalGroup(
            jPanelActionsVetsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelActionsVetsLayout.createSequentialGroup()
                .add(jButtonSeeVet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(7, 7, 7)
                .add(jButtonEditVet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonDeleteVet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout jPanelVetsLayout = new org.jdesktop.layout.GroupLayout(jPanelVets);
        jPanelVets.setLayout(jPanelVetsLayout);
        jPanelVetsLayout.setHorizontalGroup(
            jPanelVetsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelVetsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelVetsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelVetsLayout.createSequentialGroup()
                        .add(jScrollPaneVets, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelActionsVets, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelVetsLayout.createSequentialGroup()
                        .add(jButtonNewVet)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelVetsLayout.setVerticalGroup(
            jPanelVetsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelVetsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelVetsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPaneVets, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .add(jPanelVetsLayout.createSequentialGroup()
                        .add(jPanelActionsVets, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonNewVet)
                .addContainerGap())
        );

        jPanelContentBackground.add(jPanelVets, "card3");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelContentBackground, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
            .add(jPanelMenuBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jPanelMenuBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelContentBackground, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuBarTreatmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBarTreatmentsActionPerformed
        try {
            ControllerTreatment.showDataTableAll(this.tableComponentsCollection,this.getTableComponentsTreatments());
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jButtonMenuBarTreatmentsActionPerformed

    private void jButtonMenuBarConsultationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBarConsultationsActionPerformed
        try {
            ControllerConsultation.showDataTableAll(this.tableComponentsCollection,this.getTableComponentsConsultations());
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jButtonMenuBarConsultationsActionPerformed

    private void jButtonEditConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditConsultationActionPerformed
//        EditConsultationJDialog editConsultationJDialog = new EditConsultationJDialog(this,true);
//        editConsultationJDialog.setVisible(true);
        try {
            ControllerConsultation.showEditConsultationJDialogFromJTableSelection(this);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
//        (new EditConsultationJDialog(this,true,(Consultation) Controller.getSelectedObjectFromJTable(jTableConsultations))).setVisible(true);
    }//GEN-LAST:event_jButtonEditConsultationActionPerformed

    private void jButtonEditExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditExamActionPerformed
//        EditExamJDialog editExamJDialog = new EditExamJDialog(this,true);
//        editExamJDialog.setVisible(true);
        try {
            ControllerExam.showEditExamJDialogFromJTableSelection(this);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
//        (new EditExamJDialog(this,true,(Exam) Controller.getSelectedObjectFromJTable(jTableExams))).setVisible(true);
    }//GEN-LAST:event_jButtonEditExamActionPerformed

    private void jButtonMenuBarExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBarExamsActionPerformed
        try {
            ControllerExam.showDataTableAll(this.tableComponentsCollection,this.getTableComponentsExams());
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jButtonMenuBarExamsActionPerformed

    private void jButtonEditAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditAnimalActionPerformed
        try {
            ControllerAnimal.showEditAnimalJDialogFromJTableSelection(this);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jButtonEditAnimalActionPerformed

    private void jButtonMenuBarAnimalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBarAnimalsActionPerformed
        try {
            ControllerAnimal.showDataTableAll(this.tableComponentsCollection,this.getTableComponentsAnimals());
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jButtonMenuBarAnimalsActionPerformed

    private void jButtonEditClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditClientActionPerformed
        ControllerClient.showEditClientJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonEditClientActionPerformed

    private void jButtonMenuBarClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBarClientsActionPerformed
        try {
            ControllerClient.showDataTableAll(this.tableComponentsCollection,this.getTableComponentsClients());
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jButtonMenuBarClientsActionPerformed

    private void jButtonEditVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditVetActionPerformed
        ControllerVet.showEditVetJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonEditVetActionPerformed

    private void jButtonMenuBarVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBarVetsActionPerformed
        try {
            ControllerVet.showDataTableAll(this.tableComponentsCollection,this.getTableComponentsVets());
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jButtonMenuBarVetsActionPerformed

    private void jButtonNewTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewTreatmentActionPerformed
        this.jButtonMenuBarAnimals.doClick();
        javax.swing.JOptionPane.showMessageDialog(this,"Select a animal, click 'Edit' and then click 'New Treatment'.");
    }//GEN-LAST:event_jButtonNewTreatmentActionPerformed

    private void jButtonEditTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditTreatmentActionPerformed
        ControllerTreatment.showEditTreatmentJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonEditTreatmentActionPerformed

    private void jButtonDeleteTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteTreatmentActionPerformed
        ControllerTreatment.showDeleteTreatmentJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonDeleteTreatmentActionPerformed

    private void jButtonSeeTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeTreatmentActionPerformed
        ControllerTreatment.showSeeTreatmentJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonSeeTreatmentActionPerformed

    private void jButtonDeleteConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteConsultationActionPerformed
//        DeleteConsultationJDialog deleteConsultationJDialog = new DeleteConsultationJDialog(this,true);
//        deleteConsultationJDialog.setVisible(true);
        try {
            ControllerConsultation.showDeleteConsultationJDialogFromJTableSelection(this);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
//        (new DeleteConsultationJDialog(this,true,(Consultation) Controller.getSelectedObjectFromJTable(jTableConsultations))).setVisible(true);
    }//GEN-LAST:event_jButtonDeleteConsultationActionPerformed

    private void jButtonSeeConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeConsultationActionPerformed
//        SeeConsultationJDialog seeConsultationJDialog = new SeeConsultationJDialog(this,true);
//        seeConsultationJDialog.setVisible(true);
        try {
            ControllerConsultation.showSeeConsultationJDialogFromJTableSelection(this);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
//        (new SeeConsultationJDialog(this,true,(Consultation) Controller.getSelectedObjectFromJTable(jTableConsultations))).setVisible(true);
    }//GEN-LAST:event_jButtonSeeConsultationActionPerformed

    private void jButtonNewConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewConsultationActionPerformed
        this.jButtonMenuBarTreatments.doClick();
        javax.swing.JOptionPane.showMessageDialog(this,"Select a treatment, click 'Edit' and then click 'New Consultation'.");
    }//GEN-LAST:event_jButtonNewConsultationActionPerformed

    private void jButtonSeeExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeExamActionPerformed
//        SeeExamJDialog seeExamJDialog = new SeeExamJDialog(this,true);
//        seeExamJDialog.setVisible(true);
        try {
            ControllerExam.showSeeExamJDialogFromJTableSelection(this);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
//        (new SeeExamJDialog(this,true,(Exam) Controller.getSelectedObjectFromJTable(jTableExams))).setVisible(true);
    }//GEN-LAST:event_jButtonSeeExamActionPerformed

    private void jButtonDeleteExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteExamActionPerformed
//        DeleteExamJDialog deleteExamJDialog = new DeleteExamJDialog(this,true);
//        deleteExamJDialog.setVisible(true);
        try {
            ControllerExam.showDeleteExamJDialogFromJTableSelection(this);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this,ex);
        }
//        (new DeleteExamJDialog(this,true,(Exam) Controller.getSelectedObjectFromJTable(jTableExams))).setVisible(true);
    }//GEN-LAST:event_jButtonDeleteExamActionPerformed

    private void jButtonNewExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewExamActionPerformed
        this.jButtonMenuBarConsultations.doClick();
        javax.swing.JOptionPane.showMessageDialog(this,"Select a consultation, click 'Edit' and then click 'New Exam'.");
    }//GEN-LAST:event_jButtonNewExamActionPerformed

    private void jButtonSeeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeAnimalActionPerformed
        try {
            ControllerAnimal.showSeeAnimalJDialogFromJTableSelection(this);
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jButtonSeeAnimalActionPerformed

    private void jButtonDeleteAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteAnimalActionPerformed
        ControllerAnimal.showDeleteAnimalJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonDeleteAnimalActionPerformed

    private void jButtonNewAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewAnimalActionPerformed
        this.jButtonMenuBarClients.doClick();
        javax.swing.JOptionPane.showMessageDialog(this,"Select a client, click 'Edit' and then click 'New Animal'.");
    }//GEN-LAST:event_jButtonNewAnimalActionPerformed

    private void jButtonSeeClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeClientActionPerformed
        ControllerClient.showSeeClientJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonSeeClientActionPerformed

    private void jButtonDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteClientActionPerformed
        ControllerClient.showDeleteClientJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonDeleteClientActionPerformed

    private void jButtonNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewClientActionPerformed
        ControllerClient.showNewClientJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonNewClientActionPerformed

    private void jButtonSeeVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeVetActionPerformed
        ControllerVet.showSeeVetJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonSeeVetActionPerformed

    private void jButtonDeleteVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteVetActionPerformed
        ControllerVet.showDeleteVetJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonDeleteVetActionPerformed

    private void jButtonNewVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewVetActionPerformed
        ControllerVet.showNewVetJDialogFromJTableSelection(this);
    }//GEN-LAST:event_jButtonNewVetActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame.showFrame();
            }
        });
    }
    
    private static void showFrame() {
        MainJFrame jFrame = new MainJFrame();
        jFrame.setExtendedState(jFrame.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        jFrame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteAnimal;
    private javax.swing.JButton jButtonDeleteClient;
    private javax.swing.JButton jButtonDeleteConsultation;
    private javax.swing.JButton jButtonDeleteExam;
    private javax.swing.JButton jButtonDeleteTreatment;
    private javax.swing.JButton jButtonDeleteVet;
    private javax.swing.JButton jButtonEditAnimal;
    private javax.swing.JButton jButtonEditClient;
    private javax.swing.JButton jButtonEditConsultation;
    private javax.swing.JButton jButtonEditExam;
    private javax.swing.JButton jButtonEditTreatment;
    private javax.swing.JButton jButtonEditVet;
    private javax.swing.JButton jButtonMenuBarAnimals;
    private javax.swing.JButton jButtonMenuBarClients;
    private javax.swing.JButton jButtonMenuBarConsultations;
    private javax.swing.JButton jButtonMenuBarExams;
    private javax.swing.JButton jButtonMenuBarTreatments;
    private javax.swing.JButton jButtonMenuBarVets;
    private javax.swing.JButton jButtonNewAnimal;
    private javax.swing.JButton jButtonNewClient;
    private javax.swing.JButton jButtonNewConsultation;
    private javax.swing.JButton jButtonNewExam;
    private javax.swing.JButton jButtonNewTreatment;
    private javax.swing.JButton jButtonNewVet;
    private javax.swing.JButton jButtonSeeAnimal;
    private javax.swing.JButton jButtonSeeClient;
    private javax.swing.JButton jButtonSeeConsultation;
    private javax.swing.JButton jButtonSeeExam;
    private javax.swing.JButton jButtonSeeTreatment;
    private javax.swing.JButton jButtonSeeVet;
    private javax.swing.JPanel jPanelActionsAnimals;
    private javax.swing.JPanel jPanelActionsClients;
    private javax.swing.JPanel jPanelActionsConsultations;
    private javax.swing.JPanel jPanelActionsExams;
    private javax.swing.JPanel jPanelActionsTreatments;
    private javax.swing.JPanel jPanelActionsVets;
    private javax.swing.JPanel jPanelAnimals;
    private javax.swing.JPanel jPanelClients;
    private javax.swing.JPanel jPanelConsultations;
    private javax.swing.JPanel jPanelContentBackground;
    private javax.swing.JPanel jPanelExams;
    private javax.swing.JPanel jPanelMenuBar;
    private javax.swing.JPanel jPanelTreatments;
    private javax.swing.JPanel jPanelVets;
    private javax.swing.JScrollPane jScrollPaneAnimals;
    private javax.swing.JScrollPane jScrollPaneClients;
    private javax.swing.JScrollPane jScrollPaneConsultations;
    private javax.swing.JScrollPane jScrollPaneExams;
    private javax.swing.JScrollPane jScrollPaneTreatments;
    private javax.swing.JScrollPane jScrollPaneVets;
    private javax.swing.JTable jTableAnimals;
    private javax.swing.JTable jTableClients;
    private javax.swing.JTable jTableConsultations;
    private javax.swing.JTable jTableExams;
    private javax.swing.JTable jTableTreatments;
    private javax.swing.JTable jTableVets;
    // End of variables declaration//GEN-END:variables
    
}
