import javax.swing.ImageIcon;


public class VentanaMain {

	
	  VentanaPrincipal vp;
	  VentanaInicial vi;

	  public VentanaMain() {
	    inicioPantalla();
		vi.velocidadDeCarga();
		
		inicioPantallaPrincipal();
		
	  }
	  
	  private void inicioPantallaPrincipal(){
		  
			vp= new VentanaPrincipal();
			vp.setVisible(true);
	  }
	  private void inicioPantalla() {

	    vi = new VentanaInicial();
	    vi.setLocationRelativeTo(null);
	    vi.setProgresoMax(100);
	    
	    vi.setVisible(true);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VentanaMain();
		
	}

}
