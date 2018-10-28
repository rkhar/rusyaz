import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.io.*;
        import java.nio.file.Files;
        import java.nio.file.Path;

        import static javax.swing.JOptionPane.showMessageDialog;

public class rusyaz {
    private JPanel panel1;
    private JComboBox novizna1;
    private JTextArea vvedenie;
    private JTextArea aktualnost;
    private JTextArea cel;
    private JTextArea obekt;
    private JTextArea predmet;
    private JTextArea metody;
    private JTextArea novizna;
    private JTextArea teoriya;
    private JTextArea praktika;
    private JButton сохранитьButton;
    private JButton button2;
    private JButton справкаButton;
    private JButton справкаButton1;
    private JButton справкаButton9;
    private JButton справкаButton3;
    private JButton справкаButton4;
    private JButton справкаButton5;
    private JButton справкаButton6;
    private JButton справкаButton7;
    private JButton справкаButton8;
    private JComboBox cel1;
    private JComboBox obekt1;
    private JComboBox aktualnost1;
    private JComboBox predmet1;
    private JComboBox metody1;
    private JComboBox teoriya1;
    private JComboBox praktika1;

    public rusyaz() {

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMessageDialog(null, "             rassul khar", "sis-1603", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        справкаButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMessageDialog(null, "Научная работа студента \u00AD" +
                        " самостоятельная разработка конкретной темы с элементами научного анализа, отражающая приобретенные студентом теоретические знания и \n" +
                        "практические навыки, умение работать с литературой, анализировать источники, делать обстоятельные и обоснованные выводы.\n" +
                        "Процесс написания научной работы включает в себя ряд взаимосвязанных этапов:\n" +
                        "        -выбор темы, согласование ее с руководителем, получение задания;\n" +
                        "        -составление личного рабочего плана выполнения курсовой работы; \n" +
                        "        -формирование структуры работы;\n" +
                        "        -сбор, анализ и обобщение материала по выбранной теме;\n" +
                        "        -формулирование основных теоретических положений, практических выводов и рекомендаций;\n" +
                        "        -проведение эксперимента (для экспериментальных дипломных работ); \n" +
                        "        -изложение курсовой и дипломной работы и представление ее руководителю;\n" +
                        "        -доработка чистового варианта с учетом замечаний руководителя;\n" +
                        "       -оформление работы, библиографического списка использованных источников и литературы, приложений и получение допуска к защите, подготовка выступления.");
            }
        });
        справкаButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Путем краткого критического анализа и сравнения с уже решенными проблемами следует показать \n" +
                        "актуальность и целесообразность работы с точки зрения ее пользы для развития науки или практики.\n" +
                        "Актуальность – обязательное требование. Поэтому понятно, что введение начинают с обоснования актуальности темы. \n" +
                        "Умение выбрать тему, правильно ее понять и оценить с точки зрения своевременности и социальной значимости \n" +
                        "характеризует научную зрелость и профессиональную подготовку автора. Для выяснения состояния разработки темы \n" +
                        "составляется краткий обзор литературы, из которого можно сделать вывод, что данная тема еще не раскрыта (раскрыта \n" +
                        "лишь частично или не в том аспекте) и поэтому требует дальнейшей разработки. ");
            }
        });
        справкаButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "В цели освещается, какое практическое совершенствование и каким путем достигается в работе. \n" +
                        "Считается, что в цели исследования неплохо в краткой форме указать пути ее достижения. \n" +
                        "Ведь изучение, определение, исследование важно не само по себе, а с точки зрения результатов и путей их достижения.");
            }
        });
        справкаButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Обязательным элементом введения является определение объекта и предмета исследования. \n" +
                        "Объектом исследования является процесс или явление, порождающее проблемную ситуацию и выбранное для изучения темы.");
            }
        });
        справкаButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Предмет исследования находится в границах объекта исследования. \n" +
                        "Т.е. в объекте выделяется та его часть, которая является предметом исследования. ");
            }
        });
        справкаButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "В методах исследования подают перечень использованных методов исследования для \n" +
                        "достижения поставленной в работе цели. При этом такой перечень лучше давать не единым массивом, \n" +
                        "а указывать, что именно исследовалось в работе с помощью того или иного метода.");
            }
        });
        справкаButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Этот раздел является одним из наиболее важных; на него всегда обратят внимание рецензенты, \n" +
                        "оппоненты, эксперты, члены комиссии. Поэтому отнестись к формулировке данного пункта \n" +
                        "необходимо со всей ответственностью. При формулировке научной новизны дают краткий \n" +
                        "перечень новых научных положений, решений, предложенных лично и полученных впервые. \n" +
                        "Необходимо в кратких и четких формулировках показать отличие полученных результатов \n" +
                        "от известных ранее, описать степень новизны (впервые получено, усовершенствовано, \n" +
                        "получило дальнейшее развитие, впервые предложено).");
            }
        });
        справкаButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "В данном разделе необходимо дать сведения о теоретической либо практической значимости, \n" +
                        "дать рекомендации касательно использования на практике полученных результатов. \n" +
                        "Следует указать сведения о внедрении результатов исследования в практическую деятельность.");
            }
        });
        справкаButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "В данном разделе необходимо дать сведения о теоретической либо практической значимости, \n" +
                        "дать рекомендации касательно использования на практике полученных результатов. \n" +
                        "Следует указать сведения о внедрении результатов исследования в практическую деятельность.");
            }
        });
        сохранитьButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/home/me/Documents"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    String text = vvedenie.getText() + aktualnost1.getSelectedItem().toString() + " " +
                            aktualnost.getText() + "\r\n" + cel1.getSelectedItem().toString() + " " +
                            cel.getText() + "\r\n" + obekt1.getSelectedItem().toString() + " " + obekt.getText() + "\r\n" +
                            predmet1.getSelectedItem().toString() + " " + predmet.getText() + "\r\n" +
                            metody1.getSelectedItem().toString() + " " + metody.getText() + "\r\n" +
                            novizna1.getSelectedItem().toString() + " " + novizna.getText() + "\r\n" +
                            teoriya1.getSelectedItem().toString() + " " + teoriya.getText() + "\r\n" +
                            praktika1.getSelectedItem().toString() + " " + praktika.getText() + "\r\n";
                        try(
                                BufferedReader reader = new BufferedReader(new StringReader(text));
                                PrintWriter writer = new PrintWriter(new FileWriter(chooser.getSelectedFile() + ".txt"));
                            ){reader.lines().forEach(line -> writer.println(line));
                        }catch (Exception e2){}
                }

                JOptionPane.showMessageDialog(null,"Сохранено!");

            }

        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new rusyaz().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
    }

}
