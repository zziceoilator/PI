import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;


public class VentanaInicial extends JWindow {
	BorderLayout borderLayout1 = new BorderLayout();
	  JLabel imageLabel = new JLabel();
	  JPanel southPanel = new JPanel();
	  FlowLayout southPanelFlowLayout = new FlowLayout();
	  JProgressBar progressBar = new JProgressBar();
	  ImageIcon imageIcon;


	  public VentanaInicial() {
		    dibujaVentana0();
		  }

	  //prueba con otro metodo
	  public void dibujaVentana0() {
		    ImageIcon imageIcon = new ImageIcon("src/imagenes/images3.jpg");
		    imageLabel.setIcon(imageIcon);
		    this.getContentPane().setLayout(borderLayout1);
		    southPanel.setLayout(southPanelFlowLayout);
		    southPanel.setBackground(Color.BLACK);
		    this.getContentPane().add(imageLabel, BorderLayout.CENTER);
		    this.getContentPane().add(southPanel, BorderLayout.SOUTH);
		    southPanel.add(progressBar, null);
		    this.pack();
		  }

	  public void setProgresoMax(int maxProgress)
	  {
	    progressBar.setMaximum(maxProgress);
	    }

	  public void setProgreso(int progress)
	  {
	    final int progreso = progress;
	        progressBar.setValue(progreso);}

	  public void setProgreso(String message, int progress)
	  {
	    final int progreso = progress;
	    final String theMessage = message;
	    setProgreso(progress);
	    progressBar.setValue(progreso);
	    setMessage(theMessage);  }

	  private void setMessage(String message)
	 {
	    if (message==null){
	      message = "";
	      progressBar.setStringPainted(false);}
	    else{
	      progressBar.setStringPainted(true);}

	    progressBar.setString(message); }

	public void velocidadDeCarga(){
	    for (int i = 0; i <= 100; i++)
	    {
	      for (long j=0; j<100000; ++j)//modifica el numero segun la velidad q desees
	      {
	        String poop = " " + (j + i);
	      }
	     setProgreso("Cargando... %" + i, i);  // si quieres q muestre los numeros y un mensaje
	     //setProgreso(i);        // solo la barra
	   }
	    dispose();
	    }
}
