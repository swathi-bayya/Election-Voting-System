import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import java.io.*;

class Project3 extends JFrame
{

static JFrame f,r;

public static int v1=0,v2=0,v3=0,v4=0,v5=0,vf=0;

public static int h1=0,h2=0,h3=0,h4=0,h5=0,hf=0;

public static void main(String[]args)
{

String pin[];

pin=new String[]{"30265"};

f=new JFrame("VOTE");

JPanelp1=new JPanel();

JPanelp=new JPanel();

JPanelp2=new JPanel();

//....................HEADINGS...............................

JLabelh=new JLabel("HYDERABAD");

h.setBounds(110,10,100,30);

JLabelv=new JLabel("VIJAYAWADA");

v.setBounds(110,10,100,30);

//..................VIJAYAWADAPARTYNAMES....................

JLabel vpl1=new JLabel("FIRE");

vpl1.setBounds(10,40,100,30);

JLabel vpl2=new JLabel("WATER");

vpl2.setBounds(10,80,100,30);

JLabel vpl3=new JLabel("AIR");

vpl3.setBounds(10,120,100,30);

JLabel vpl4=new JLabel("WOOD");

vpl4.setBounds(10,160,100,30);

JLabel vpl5=new JLabel("METAL");

vpl5.setBounds(10,200,100,30);

//.................HYDERABADPARTYNAMES.......................

JLabel hpl1=new JLabel("FIRE");

hpl1.setBounds(10,40,100,30);

JLabel hpl2=new JLabel("WATER");

hpl2.setBounds(10,80,100,30);

JLabel hpl3=new JLabel("AIR");

hpl3.setBounds(10,120,100,30);

JLabel hpl4=new JLabel("WOOD");

hpl4.setBounds(10,160,100,30);

JLabel hpl5=new JLabel("METAL");

hpl5.setBounds(10,200,100,30);

//....................VIJAYAWADACANDITATES.......................

JLabel vl1=new JLabel("HARI");

vl1.setBounds(80,40,100,30);

JLabel vl2=new JLabel("RAM");

vl2.setBounds(80,80,100,30);

JLabel vl3=new JLabel("CHANDRA");

vl3.setBounds(80,120,100,30);

JLabel vl4=new JLabel("SATWIK");

vl4.setBounds(80,160,100,30);

JLabel vl5=new JLabel("SANJAY");

vl5.setBounds(80,200,100,30);

//.................HYDERABADCANDITATES............................

JLabel hl1=new JLabel("BHARGAV");

hl1.setBounds(80,40,100,30);

JLabel hl2=new JLabel("TEJA");

hl2.setBounds(80,80,100,30);

JLabel hl3=new JLabel("VENKAT");

hl3.setBounds(80,120,100,30);

JLabel hl4=new JLabel("RAMANA");

hl4.setBounds(80,160,100,30);

JLabel hl5=new JLabel("RAMALAKSHMI");

hl5.setBounds(80,200,100,30);

//..........................VIJAYAWADABUTTONS.......................

JButton vb1=new JButton("VOTE");

vb1.setBounds(160,40,100,30);

JButton vb2=new JButton("VOTE");

vb2.setBounds(160,80,100,30);

JButton vb3=new JButton("VOTE");

vb3.setBounds(160,120,100,30);

JButton vb4=new JButton("VOTE");

vb4.setBounds(160,160,100,30);

JButton vb5=new JButton("VOTE");

vb5.setBounds(160,200,100,30);

//........................HYDERABADBUTTONS.........................

JButton hb1=new JButton("VOTE");

hb1.setBounds(180,40,100,30);

JButton hb2=new JButton("VOTE");

hb2.setBounds(180,80,100,30);

JButton hb3=new JButton("VOTE");

hb3.setBounds(180,120,100,30);

JButton hb4=new JButton("VOTE");

hb4.setBounds(180,160,100,30);

JButton hb5=new JButton("VOTE");

hb5.setBounds(180,200,100,30);

JLabel pinl=new JLabel("PIN");
pinl.setBounds(10,10,150,30);

JTextField pint=new JPasswordField();

pint.setBounds(10,30,150,30);

JButton a=new JButton("SUBMIT");

a.setBounds(30,70,150,30);

//............................RESULT................................

JButton b=new JButton("RESULT");

b.setBounds(100,100,100,100);

//...........................PANELS................................

p1.add(h);

p.add(v);

p.add(vpl1);

p.add(vpl2);

p.add(vpl3);

p.add(vpl4);

p.add(vpl5);

p1.add(hpl1);

p1.add(hpl2);

p1.add(hpl3);

p1.add(hpl4);

p1.add(hpl5);

p.add(vl1);

p.add(vl2);

p.add(vl3);

p.add(vl4);

p.add(vl5);

p1.add(hl1);

p1.add(hl2);

p1.add(hl3);

p1.add(hl4);

p1.add(hl5);

p.add(vb1);

p.add(vb2);

p.add(vb3);

p.add(vb4);

p.add(vb5);

p1.add(hb1);

p1.add(hb2);

p1.add(hb3);

p1.add(hb4);

p1.add(hb5);

p2.add(b);

JSplitPane s1=new JSplitPane(SwingConstants.VERTICAL,p1,p);

JSplitPane s2=new JSplitPane(SwingConstants.HORIZONTAL,s1,p2);

s1.setDividerLocation(290);

s1.setOrientation(SwingConstants.VERTICAL);

s2.setDividerLocation(590);

s2.setOrientation(SwingConstants.HORIZONTAL);

f.add(s2);

f.setSize(600,800);

p1.setLayout(null);

p.setLayout(null);

f.setVisible(true);

//..............................ACTION..............................

vb1.addActionListener(newActionListener(){

public void actionPerformed(ActionEvent e){

    v1++;
 
   vf=1;

}
});

vb2.addActionListener(newActionListener(){

public void actionPerformed(ActionEvent e){
 
   v2++;

vf=1;

}
});

vb3.addActionListener(newActionListener(){

public void actionPerformed(ActionEvent e){

vf=1;

v3++;

}
});

vb4.addActionListener(newActionListener(){

public void actionPerformed(ActionEvent e){

vf=1;

v4++;

}
});

vb5.addActionListener(newActionListener(){

public void actionPerformed(ActionEvent e){

vf=1;

v5++;

}
});

hb1.addActionListener(newActionListener(){

public void actionPerformed(ActionEvent e){

hf=1;

h1++;

}
});

hb2.addActionListener(newActionListener(){

public void actionPerformed(ActionEvent e){

hf=1;

h2++;

}
});

hb3.addActionListener(newActionListener(){

publicvoidactionPerformed(ActionEvent e){
 
   hf=1;

h3++;

}
});

hb4.addActionListener(newActionListener(){
publicvoidactionPerformed(ActionEvent e){

hf=1;

h4++;

}
});

hb5.addActionListener(newActionListener(){

publicvoidactionPerformed(ActionEvent e){

hf=1;

h5++;

}
});

//.............................RESULTPANEL...............................

b.addActionListener(newActionListener(){

public void actionPerformed(ActionEvent e){

f=new JFrame("PASSWORD");

f.add(pinl);

f.add(pint);

f.add(a);

f.setSize(600,800);

f.setLayout(null);

f.setVisible(true);

}
});

a.addActionListener(newActionListener(){

public void actionPerformed(ActionEvent e){

r=new JFrame("RESULT");

JTextField vpt=new JTextField();

vpt.setBounds(200,20,150,30);

JTextField hpt=new JTextField();

hpt.setBounds(200,60,150,30);

JTextField vpct=new JTextField();

vpct.setBounds(200,100,150,30);

JTextField hpct=new JTextField();

hpct.setBounds(200,140,150,30);

JLabel vp=new JLabel("VIJAYAWADAPARTY");

vp.setBounds(0,20,150,30);

JLabel hp=new JLabel("HYDERABADPARTY");

hp.setBounds(0,60,150,30);

JLabel vpc=new JLabel("VIJAYAWADACANDIDATE");

vpc.setBounds(0,100,150,30);

JLabel hpc=new JLabel("HYDERABADCANDIDATE");

hpc.setBounds(0,140,150,30);

JPanel rp=new JPanel();

JPanel pa=new JPanel();

JPanel pb=new JPanel();

JTextField v11=new JTextField();

v11.setBounds(160,40,100,30);

JTextField v12=new JTextField();

v12.setBounds(160,80,100,30);

JTextField v13=new JTextField();

v13.setBounds(160,120,100,30);

JTextField v14=new JTextField();

v14.setBounds(160,160,100,30);

JTextField v15=new JTextField();

v15.setBounds(160,200,100,30);

JTextField h11=new  JTextField();

h11.setBounds(180,40,100,30);

JTextField h12=new JTextField();

h12.setBounds(180,80,100,30);

JTextField h13=new JTextField();

h13.setBounds(180,120,100,30);

JTextField h14=new JTextField();

h14.setBounds(180,160,100,30);

JTextField h15=new JTextField();

h15.setBounds(180,200,100,30);

if(vf==1&&hf==1)
{
if(v1>=v2&&v1>=v3&&v1>=v4&&v1>=v5){

vpt.setText("FIRE");

vpct.setText("HARI");

}

if(v2>=v1&&v2>=v3&&v2>=v4&&v2>=v5)
{

vpt.setText("WATER");

vpct.setText("RAM");

}

if(v3>=v1&&v3>=v2&&v3>=v4&&v3>=v5)
{

vpt.setText("AIR");

vpct.setText("CHANDRA");

}

if(v4>=v1&&v4>=v2&&v4>=v3&&v4>=v5)
{

vpt.setText("WOOD");

vpct.setText("SATWIK");

}

if(v5>=v1&&v5>=v2&&v5>=v3&&v5>=v4)
{

vpt.setText("METAL");

vpct.setText("SANJAY");

}

if(h1>=h2&&h1>=h3&&h1>=h4&&h1>=h5)
{

hpt.setText("FIRE");

hpct.setText("BHARGAV");

}

if(h2>=h1&&h2>=h3&&h2>=h4&&h2>=h5)
{

hpt.setText("WATER");

hpct.setText("TEJA");

}

if(h3>=h1&&h3>=h2&&h3>=h4&&h3>=h5)
{

hpt.setText("AIR");

hpct.setText("VENKAT");

}

if(h4>=h1&&h4>=h2&&h4>=h3&&h4>=h5)
{

hpt.setText("WOOD");

hpct.setText("RAMANA");

}

if(h5>=h1&&h5>=h2&&h5>=h3&&h5>=h4)
{

hpt.setText("METAL");

hpct.setText("RAMALAKSHMI");

}

v11.setText(""+v1);

v12.setText(""+v2);

v13.setText(""+v3);

v14.setText(""+v4);

v15.setText(""+v5);

h11.setText(""+h1);

h12.setText(""+h2);

h13.setText(""+h3);

h14.setText(""+h4);

h15.setText(""+h5);

}

else
{
vpt.setText("WON");

hpt.setText("WON");

vpct.setText("WON");

hpct.setText("WON");

}

if(pin[0].equals(pint.getText()))
{

pa.add(vpl1);

pa.add(vpl2);

pa.add(vpl3);

pa.add(vpl4);

pa.add(vpl5);

pa.add(v);

pa.add(v11);

pa.add(v12);

pa.add(v13);

pa.add(v14);

pa.add(v15);

pa.add(vl1);

pa.add(vl2);

pa.add(vl3);

pa.add(vl4);

pa.add(vl5);

pb.add(h);

pb.add(h11);

pb.add(h12);

pb.add(h13);

pb.add(h14);

pb.add(h15);

pb.add(hpl1);

pb.add(hpl2);

pb.add(hpl3);

pb.add(hpl4);

pb.add(hpl5);

pb.add(hl1);

pb.add(hl2);

pb.add(hl3);

pb.add(hl4);

pb.add(hl5);

rp.add(vp);

rp.add(vpc);

rp.add(hp);

rp.add(hpc);

rp.add(vpt);

rp.add(hpt);

rp.add(vpct);

rp.add(hpct);

r.dispose();

JSplitPane s1=new JSplitPane(SwingConstants.HORIZONTAL,pa,pb);

JSplitPane s2=new JSplitPane(SwingConstants.VERTICAL,s1,rp);

s1.setDividerLocation(290);

s1.setOrientation(SwingConstants.VERTICAL);

s2.setDividerLocation(390);

s2.setOrientation(SwingConstants.HORIZONTAL);

r.add(s2);

r.setSize(600,800);

rp.setLayout(null);

pa.setLayout(null);

pb.setLayout(null);

r.setVisible(true);

}
}
});

}
}
