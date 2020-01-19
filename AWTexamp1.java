import java.awt.*;
import java.awt.event.*;
class AWTexamp1
{
	public static void main(String []arg){
		new Exmp1();
}
}
class Exmp1 extends Frame
{
 Button s,c;
 Label ln,lp;
 TextField tn,tp;
 public Exmp1(){
	setTitle("Login Page");
	setLayout(null);
	setSize(500,500);
	s=new Button("SUBMIT");
	c=new Button("CANCLE");
	ln=new Label("User Name");
	lp=new Label("Password");
	tn=new TextField();
	tp=new TextField();
	ln.setBounds(100,100,80,20);
	lp.setBounds(100,140,80,20);
	tn.setBounds(200,100,150,20);
	tp.setBounds(200,140,150,20);
	s.setBounds(120,180,70,20);
	c.setBounds(250,180,70,20);
	add(s);add(c);add(ln);add(lp);add(tn);add(tp);
	setVisible(true);
 }
}