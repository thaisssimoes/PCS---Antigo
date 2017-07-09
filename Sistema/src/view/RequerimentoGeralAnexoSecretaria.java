/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static controller.Gerenciador.obterAluno;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import model.entity.Aluno;
import model.entity.Tecnico;
import model.requerimento.Requerimento;

/**
 *
 * @author labccet
 */
public class RequerimentoGeralAnexoSecretaria extends javax.swing.JFrame {

    /**
     * Creates new form telaAluno
     */
    public RequerimentoGeralAnexoSecretaria() {
        initComponents();
    }
    Tecnico tecnico;
    Requerimento requerimento;
    public RequerimentoGeralAnexoSecretaria(String cpf, String senha, String titulo) {
        this.setTitle(titulo);
        initComponents();
        preencherTela();
        preencherCampos();
        centralizarTela();
        
        
        
        initComponents();
        this.tecnico = tecnico;
       

        centralizarTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dataFechamentoFixo = new javax.swing.JLabel();
        dataAberturaLabel = new javax.swing.JLabel();
        dataFechamentoLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nomeCompletoTecnico = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        siapeTecnico = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        emailTecnico = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        telefoneCelTecnico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        exportarBotao = new javax.swing.JButton();
        cancelarBotao = new javax.swing.JButton();
        enviarBotao = new javax.swing.JButton();
        disciplinaComboBox = new javax.swing.JComboBox();
        disciplinaLabelFixo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        anexo2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        anexo1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        professorLabelFixo = new javax.swing.JLabel();
        professorLabelDisciplina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel2.setBackground(new java.awt.Color(56, 113, 156));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iBSI.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("numero de protocolo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("status");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de abertura:");

        dataFechamentoFixo.setForeground(new java.awt.Color(255, 255, 255));
        dataFechamentoFixo.setText("Data de fechamento:");

        dataAberturaLabel.setForeground(new java.awt.Color(255, 255, 255));
        dataAberturaLabel.setText("dd/mm/yyyy");

        dataFechamentoLabel.setForeground(new java.awt.Color(255, 255, 255));
        dataFechamentoLabel.setText("dd/mm/yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(591, 591, 591)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataFechamentoFixo)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataAberturaLabel)
                            .addComponent(dataFechamentoLabel))
                        .addGap(138, 138, 138))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(dataAberturaLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(dataFechamentoFixo)
                                    .addComponent(dataFechamentoLabel))))
                        .addGap(19, 19, 19))))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nome:");

        nomeCompletoTecnico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeCompletoTecnico.setText("Nome Completo do Aluno");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("SIAPE");

        siapeTecnico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        siapeTecnico.setText("123456789");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("E-mail:");

        emailTecnico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailTecnico.setText("nome.sobrenome@uniriotec.br");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Telefone:");

        telefoneCelTecnico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefoneCelTecnico.setText("(21) 9-2222-2222");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Descrição:");

        exportarBotao.setBackground(new java.awt.Color(56, 113, 156));
        exportarBotao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exportarBotao.setForeground(new java.awt.Color(255, 255, 255));
        exportarBotao.setText("Exportar");
        exportarBotao.setEnabled(false);
        exportarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarBotaoActionPerformed(evt);
            }
        });

        cancelarBotao.setBackground(new java.awt.Color(56, 113, 156));
        cancelarBotao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelarBotao.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBotao.setText("Cancelar");
        cancelarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotaoActionPerformed(evt);
            }
        });

        enviarBotao.setBackground(new java.awt.Color(56, 113, 156));
        enviarBotao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enviarBotao.setForeground(new java.awt.Color(255, 255, 255));
        enviarBotao.setText("Enviar");
        enviarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBotaoActionPerformed(evt);
            }
        });

        disciplinaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administração Financeira", "Álgebra Linear", "Análise de Algoritmo", "Análise de Sistemas", "Análise Empresarial e Admin.", "Banco de Dados I", "Banco de Dados II", "Cálculo Diferenc. e Integral I", "Cálculo Diferenc. e Integral II", "Desenvolv. de Páginas Web", "Empreendedorismo", "Estatística", "Estruturas de Dados I", "Estruturas de Dados II", "Estruturas Discretas", "Fund. de Sist. de Informação", "Gerência de Proj. de Informat.", "Interação Humano Computador", "Introdução à Lógica Computac.", "Linguag. Formais e Autômatos", "Matemática Básica", "Organização de Computadores", "Probabilidade", "Processos de Software", "Programação Modular", "Projeto de Graduação I", "Projeto de Graduação II", "Proj. e Const. de Sistemas", "Proj. Const. Sistemas-SGBD", "Redes de Computadores I", "Redes de Computadores II", "Sistemas Operacionais", "Técnicas de Programação I", "Técnicas de Programação II", "Teorias e Práticas Discursivas" }));

        disciplinaLabelFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        disciplinaLabelFixo.setText("Disciplina:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Resposta:");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/documentoAnexar.png"))); // NOI18N

        jLabel4.setText("Anexo");

        javax.swing.GroupLayout anexo2Layout = new javax.swing.GroupLayout(anexo2);
        anexo2.setLayout(anexo2Layout);
        anexo2Layout.setHorizontalGroup(
            anexo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anexo2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(anexo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel4))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        anexo2Layout.setVerticalGroup(
            anexo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, anexo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(5, 5, 5))
        );

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/documentoAnexar.png"))); // NOI18N

        jLabel6.setText("Anexo");

        javax.swing.GroupLayout anexo1Layout = new javax.swing.GroupLayout(anexo1);
        anexo1.setLayout(anexo1Layout);
        anexo1Layout.setHorizontalGroup(
            anexo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anexo1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(anexo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel6))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        anexo1Layout.setVerticalGroup(
            anexo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, anexo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(5, 5, 5))
        );

        professorLabelFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        professorLabelFixo.setText("Professor:");

        professorLabelDisciplina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        professorLabelDisciplina.setText("Professor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(21, 21, 21)
                                        .addComponent(nomeCompletoTecnico))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(21, 21, 21)
                                        .addComponent(emailTecnico)))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(telefoneCelTecnico))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(siapeTecnico))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(professorLabelFixo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(professorLabelDisciplina)
                                            .addGap(122, 122, 122))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(disciplinaLabelFixo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(disciplinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(anexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(anexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(cancelarBotao)
                        .addGap(66, 66, 66)
                        .addComponent(exportarBotao)
                        .addGap(59, 59, 59)
                        .addComponent(enviarBotao)))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(nomeCompletoTecnico))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(emailTecnico)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(siapeTecnico))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(telefoneCelTecnico))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(disciplinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(disciplinaLabelFixo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(professorLabelFixo)
                            .addComponent(professorLabelDisciplina))))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBotao)
                    .addComponent(exportarBotao)
                    .addComponent(enviarBotao))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void preencherCampos() {
        emailTecnico.setText(tecnico.getEmail());
        nomeCompletoTecnico.setText(tecnico.getNome());
        siapeTecnico.setText(tecnico.getSiape());
        //telefoneCelTecnico.setText(tecnico.getTelefoneCelular()); DANDO NULL!?
        dataAberturaLabel.setText(String.valueOf(LocalDate.now()));
        
    }
    
      private void preencherTela(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        String titulo = this.getTitle();
        System.out.println(titulo);
        dataFechamentoLabel.setVisible(false);
        dataFechamentoFixo.setVisible(false);
        professorLabelFixo.setVisible(false);
        professorLabelDisciplina.setVisible(false);
        if(titulo.equals("Realização de segunda chamada")
            || titulo.equals("Revisão de prova")
            || titulo.equals("Isenção ou aproveitamento de disciplina")){
            disciplinaLabelFixo.setVisible(true);
            disciplinaComboBox.setVisible(true);
            anexo1.setVisible(true);
            anexo2.setVisible(true);
        }
        else{         
            disciplinaLabelFixo.setVisible(false);
            disciplinaComboBox.setVisible(false);
            anexo1.setVisible(false);
            anexo2.setVisible(false);
            this.setBounds(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2, 700, 500);
               
        }
    }
    private void centralizarTela() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }


    private void enviarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBotaoActionPerformed
//        ConfirmacaoEnvio janelaConfirmacao = new ConfirmacaoEnvio(aluno.getCpf(),aluno.getSenha());
//        janelaConfirmacao.setVisible(true);
//        this.setVisible(false);
//        this.dispose();
    }//GEN-LAST:event_enviarBotaoActionPerformed

    private void exportarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarBotaoActionPerformed
        PopupComentario janelaComentario = new PopupComentario(tecnico.getCpf(), tecnico.getSenha());
        janelaComentario.setVisible(true);    }//GEN-LAST:event_exportarBotaoActionPerformed

    private void cancelarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotaoActionPerformed
        TelaSecretaria janelaTelaSecretaria = new TelaSecretaria(tecnico);
        janelaTelaSecretaria.setVisible(true);
        this.setVisible(false);
        this.dispose();;

    }//GEN-LAST:event_cancelarBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequerimentoGeralAnexoSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequerimentoGeralAnexoSecretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel anexo1;
    private javax.swing.JPanel anexo2;
    private javax.swing.JButton cancelarBotao;
    private javax.swing.JLabel dataAberturaLabel;
    private javax.swing.JLabel dataFechamentoFixo;
    private javax.swing.JLabel dataFechamentoLabel;
    private javax.swing.JComboBox disciplinaComboBox;
    private javax.swing.JLabel disciplinaLabelFixo;
    private javax.swing.JLabel emailTecnico;
    private javax.swing.JButton enviarBotao;
    private javax.swing.JButton exportarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel nomeCompletoTecnico;
    private javax.swing.JLabel professorLabelDisciplina;
    private javax.swing.JLabel professorLabelFixo;
    private javax.swing.JLabel siapeTecnico;
    private javax.swing.JLabel telefoneCelTecnico;
    // End of variables declaration//GEN-END:variables
}
