package classes;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class FrontEnd extends JFrame {
    private TitleBar title;
    private Lista lista;
    private ButtonCustom btnCustom;
    //Construtores 
    FrontEnd()
    {
        this.setSize(500,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new TitleBar();
        lista = new Lista();
        btnCustom = new ButtonCustom();
        this.add(title,BorderLayout.NORTH);
    }
    
}
