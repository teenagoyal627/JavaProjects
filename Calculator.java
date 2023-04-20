
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {

    Frame f;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bp, bs, bm, bd, be;
    TextField t;
    int a, b, c;
    String opt;

    Calculator() {
        // memory allocation
        // it is must to give memory to all variable otherwise it give an
        // error:exception in thread main java.lang.null pointer exception

        f = new Frame("Calculator");
        t = new TextField();
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        bp = new Button("+");
        bs = new Button("-");
        bm = new Button("*");
        bd = new Button("/");
        be = new Button("=");
        // add on frame
        f.add(t);
        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bp);
        f.add(bs);
        f.add(bm);
        f.add(bd);
        f.add(be);

        f.setLayout(null);
        // now give the position of each element on calculator
        t.setBounds(30, 50, 150, 20);
        b1.setBounds(20, 80, 30, 30);
        b2.setBounds(60, 80, 30, 30);
        b3.setBounds(100, 80, 30, 30);
        b4.setBounds(140, 80, 30, 30);
        b5.setBounds(20, 120, 30, 30);
        b6.setBounds(60, 120, 30, 30);
        b7.setBounds(100, 120, 30, 30);
        b8.setBounds(140, 120, 30, 30);
        b9.setBounds(20, 160, 30, 30);
        b0.setBounds(60, 160, 30, 30);
        be.setBounds(100, 160, 70, 30);
        bp.setBounds(20, 200, 30, 30);
        bs.setBounds(60, 200, 30, 30);
        bm.setBounds(100, 200, 30, 30);
        bd.setBounds(140, 200, 30, 30);

        // add actionlistener
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bp.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        be.addActionListener(this);

        f.setVisible(true);
        f.setSize(250, 300);

    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();// this is used for return label
        if (s.equals("+")) {
            a = Integer.parseInt(t.getText());
            t.setText("");
            opt = "+";
        } else if (s.equals("-")) {
            a = Integer.parseInt(t.getText());
            t.setText("");
            opt = "-";
        } else if (s.equals("*")) {
            a = Integer.parseInt(t.getText());
            t.setText("");
            opt = "*";
        } else if (s.equals("/")) {
            a = Integer.parseInt(t.getText());
            t.setText("");
            opt = "/";
        } else if (s.equals("=")) {
            b = Integer.parseInt(t.getText());
            if (opt.equals("+"))
                c = a + b;
            else if (opt.equals("-"))
                c = a - b;
            else if (opt.equals("*"))
                c = a * b;
            else if (opt.equals("/"))
                c = a / b;

            t.setText(Integer.toString(c));
        } else {
            t.setText(t.getText() + s);
        }

    }

    public static void main(String arr[]) {
        Calculator c = new Calculator();
    }

}
