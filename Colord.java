
    import java.awt.*;
    
    import java.awt.event.*;
    public class Colord extends  AdjustmentListener
    {
        Scrollbar red,green,blue;
        Label l1,l2,l3;  
        public void init()
        {
            l1=new Label("Red");
            l2=new Label("Green");
            l3=new Label("Blue");
            red=new Scrollbar(Scrollbar.HORIZONTAL,5,10,0,50);
            green=new Scrollbar(Scrollbar.HORIZONTAL,5,10,0,50);
            blue=new Scrollbar(Scrollbar.HORIZONTAL,5,10,0,50);
            red.addAdjustmentListener(this);
            green.addAdjustmentListener(this);
            blue.addAdjustmentListener(this);
            add(l1);
            add(red);
            add(l2);
            add(green);
            add(l3);
            add(blue);
        
        }
        public void AdjustmentValueChanged(AdjustmentEvent ae)
        {
            if(ae.getSource()==red)
            {
                setBackground(Color.red);

            }
            if(ae.getSource()==green)
            {
                setBackground(Color.green);
                
            }
            if(ae.getSource()==blue)
            {
                setBackground(Color.blue);
                
            }
        }
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'adjustmentValueChanged'");
        }
    }
