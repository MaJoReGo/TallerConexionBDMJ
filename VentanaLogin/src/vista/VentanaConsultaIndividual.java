package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.vo.UsuarioVo;

import controlador.Coordinador;
import java.awt.Color;


/**
 *
 * @author User
 */
public class VentanaConsultaIndividual extends JDialog implements ActionListener{

    private JLabel LabelDireccion,TituloConsulta, labelDocumento,labelEdad, labelNombre, labelProfesion, labelTelefono,labelTexto;
    private JButton btonCancelar,btonConsultar,btonActualizar,btonEliminar;
    private JTextField campoTelefono,campoDireccion,campoConsultaDocumento, campoDocumento,campoEdad,campoNombre,campoProfesion;
    private javax.swing.JPanel panelConsulta;
    
    private javax.swing.JSeparator separadorInferior,separadorSuperior;
    
    private Coordinador miCoordinador;
	
    /**
     * Creates new form VentanaConsultaIndividual
     */
    public VentanaConsultaIndividual(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(482,272);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConsulta = new javax.swing.JPanel();
        TituloConsulta = new javax.swing.JLabel();
        TituloConsulta.setForeground(new Color(255, 0, 128));
        labelProfesion = new javax.swing.JLabel();
        labelProfesion.setForeground(new Color(255, 0, 128));
        labelTelefono = new javax.swing.JLabel();
        labelTelefono.setForeground(new Color(255, 0, 128));
        labelTexto = new javax.swing.JLabel();
        labelTexto.setForeground(new Color(255, 0, 128));
        labelDocumento = new javax.swing.JLabel();
        labelDocumento.setForeground(new Color(255, 0, 128));
        labelEdad = new javax.swing.JLabel();
        labelEdad.setForeground(new Color(255, 0, 128));
        LabelDireccion = new javax.swing.JLabel();
        LabelDireccion.setForeground(new Color(255, 0, 128));
        labelNombre = new javax.swing.JLabel();
        labelNombre.setForeground(new Color(255, 0, 128));
        separadorInferior = new javax.swing.JSeparator();
        campoNombre = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoProfesion = new javax.swing.JTextField();
        campoConsultaDocumento = new javax.swing.JTextField();
        campoEdad = new javax.swing.JTextField();
        separadorSuperior = new javax.swing.JSeparator();
        btonCancelar = new javax.swing.JButton();
        btonConsultar = new javax.swing.JButton();
        campoDocumento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //getContentPane().setLayout(null);

        panelConsulta.setBackground(new java.awt.Color(204, 204, 204));
        panelConsulta.setLayout(null);

        TituloConsulta.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        TituloConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloConsulta.setText("Consultar Usuario");
        TituloConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelConsulta.add(TituloConsulta);
        TituloConsulta.setBounds(20, 10, 660, 60);

        labelProfesion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelProfesion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelProfesion.setText("Profesi�n:");
        panelConsulta.add(labelProfesion);
        labelProfesion.setBounds(0, 170, 90, 20);

        labelTelefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTelefono.setText("Telefono:");
        panelConsulta.add(labelTelefono);
        labelTelefono.setBounds(400, 200, 100, 20);

        labelTexto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelTexto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTexto.setText("Ingrese el documento del usuario a consultar");
        panelConsulta.add(labelTexto);
        labelTexto.setBounds(0, 90, 380, 20);

        labelDocumento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelDocumento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDocumento.setText("*Documento:");
        panelConsulta.add(labelDocumento);
        labelDocumento.setBounds(400, 140, 100, 20);

        labelEdad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEdad.setText("Edad:");
        panelConsulta.add(labelEdad);
        labelEdad.setBounds(400, 170, 100, 20);

        LabelDireccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        LabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelDireccion.setText("Direcci�n:");
        panelConsulta.add(LabelDireccion);
        LabelDireccion.setBounds(0, 200, 90, 20);

        labelNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNombre.setText("*Nombre:");
        panelConsulta.add(labelNombre);
        labelNombre.setBounds(0, 140, 90, 20);
        panelConsulta.add(separadorInferior);
        separadorInferior.setBounds(20, 240, 660, 10);
        panelConsulta.add(campoNombre);
        campoNombre.setBounds(100, 140, 300, 20);
        panelConsulta.add(campoDireccion);
        campoDireccion.setBounds(100, 200, 300, 20);
        panelConsulta.add(campoTelefono);
        campoTelefono.setBounds(510, 200, 170, 20);
        panelConsulta.add(campoProfesion);
        campoProfesion.setBounds(100, 170, 300, 20);
        panelConsulta.add(campoConsultaDocumento);
        campoConsultaDocumento.setBounds(390, 90, 120, 20);
        panelConsulta.add(campoEdad);
        campoEdad.setBounds(510, 170, 170, 20);
        panelConsulta.add(separadorSuperior);
        separadorSuperior.setBounds(20, 120, 660, 10);
        btonActualizar = new javax.swing.JButton();
        btonEliminar = new javax.swing.JButton();

        btonCancelar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btonCancelar.setText("Cancelar");
        panelConsulta.add(btonCancelar);
        btonCancelar.setBounds(510, 260, 170, 30);
        btonCancelar.addActionListener(this);

        btonConsultar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btonConsultar.setText("Buscar");
        btonConsultar.addActionListener(this);
        panelConsulta.add(btonConsultar);
        btonConsultar.setBounds(520, 90, 110, 20);   
        
        btonActualizar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btonActualizar.setText("Actualizar");
        panelConsulta.add(btonActualizar);
        btonActualizar.setBounds(110, 260, 170, 30);
        btonActualizar.addActionListener(this);
        
        btonEliminar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btonEliminar.setText("Eliminar");
        panelConsulta.add(btonEliminar);
        btonEliminar.setBounds(310, 260, 170, 30);
        btonEliminar.addActionListener(this);
        
        panelConsulta.add(campoDocumento);
        campoDocumento.setBounds(510, 140, 170, 20);

        getContentPane().add(panelConsulta);
        panelConsulta.setBounds(0, 0, 710, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btonCancelar) {
			limpiarVentana();
			dispose();
		}
		
		if (e.getSource()==btonConsultar) {
			consultarUsuario();
		}
		
		if (e.getSource()==btonActualizar) {
			actualizaUsuario();
		}
		
		if (e.getSource()==btonEliminar) {
			eliminaUsuario();
		}
		
	}

	private void limpiarVentana() {
		campoConsultaDocumento.setText("");
		campoNombre.setText("");
		campoDocumento.setText("");
		campoProfesion.setText("");
		campoDireccion.setText("");
		campoTelefono.setText("");
		campoEdad.setText("");
	}

	private void consultarUsuario() {
		UsuarioVo usuarioVO=miCoordinador.consultarUsuario(campoConsultaDocumento.getText().trim());
		
		if (usuarioVO!=null) {
			
			campoNombre.setText(usuarioVO.getNombre());
			campoDocumento.setText(usuarioVO.getDocumento());
			campoProfesion.setText(usuarioVO.getProfesion());
			campoDireccion.setText(usuarioVO.getDireccion());
			campoTelefono.setText(usuarioVO.getTelefono());
			campoEdad.setText(usuarioVO.getEdad()+"");
			
		}else{
			JOptionPane.showMessageDialog(null, "El usuario no se encuentra registrado en el sistema",
					"Datos Inexistentes",JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	/**
	 * metodo que permite actualizar un usuario, se envia el numero de documento del usuario 
	 * obtenido del campo de texto especifico de la ventana
	 */
	private void actualizaUsuario() {
		
		Integer edad=miCoordinador.validarEdad(campoEdad.getText().trim());
		
		if (edad!=null) {
			
			UsuarioVo miUsuarioVo=new UsuarioVo();
			//se asigna cada dato... el metodo trim() del final, permite eliminar espacios al inicio y al final, en caso de que se ingresen datos con espacio
			miUsuarioVo.setDocumento(campoDocumento.getText().trim());
			miUsuarioVo.setNombre(campoNombre.getText().trim());
			miUsuarioVo.setEdad(Integer.parseInt(campoEdad.getText().trim()));
			miUsuarioVo.setProfesion(campoProfesion.getText().trim());
			miUsuarioVo.setTelefono(campoTelefono.getText().trim());
			miUsuarioVo.setDireccion(campoDireccion.getText().trim());
			
			String actualiza="";
			//se llama al metodo validarCampos(), este retorna true o false, dependiendo de eso ingresa a una de las opciones
			if (miCoordinador.validarCampos(miUsuarioVo)) {
				//si se retorn� true es porque todo est� correcto y se llama a actualizar
				actualiza=miCoordinador.actualizaUsuario(miUsuarioVo);//en registro se almacena ok o error, dependiendo de lo que retorne el metodo
			}else{
				actualiza="mas_datos";//si validarCampos() retorna false, entonces se guarda la palabra mas_datos para indicar que hace falta diligenciar los campos obligatorios
			}
			
			//si el registro es exitoso muestra un mensaje en pantalla, sino, se valida si necesita mas datos o hay algun error
			if (actualiza.equals("ok")) {
				JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);			
			}else{
				if (actualiza.equals("mas_datos")) {
					JOptionPane.showMessageDialog(null, "Debe Ingresar los campos obligatorios","Faltan Datos",JOptionPane.WARNING_MESSAGE);			
				}else{
		            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);
				}
			}					
			
		}else{
			JOptionPane.showMessageDialog(null, "Debe ingresar una edad Valida!!!","Advertencia",JOptionPane.ERROR_MESSAGE);
		}

				
	}
	
	private void eliminaUsuario() {
		String documento=campoDocumento.getText().trim();
		String elimina="";
		if (!documento.equals("")) {
			
			int resp=JOptionPane.showConfirmDialog(null,"Esta seguro de eliminar el usuario "+documento+"?");
		      if (JOptionPane.OK_OPTION == resp){
		    	  elimina=miCoordinador.eliminarUsuario(documento);
		    	  
					if (elimina.equals("ok")) {
						JOptionPane.showMessageDialog(null, " Se ha Eliminado" +
			            		" Correctamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);	
						limpiarVentana();
					}else{
						JOptionPane.showMessageDialog(null, "No se pudo eliminar ","Informaci�n",JOptionPane.WARNING_MESSAGE);
					}
					
				}else{
					JOptionPane.showMessageDialog(null, "Ingrese un documento ","Informaci�n",JOptionPane.WARNING_MESSAGE);
				}
 
		      }
	}


}
