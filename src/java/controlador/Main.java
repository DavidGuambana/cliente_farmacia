package controlador;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import vista.VPedido;
import ws.Medicamento;
import ws.Operaciones;
import ws.Operaciones_Service;
import ws.Pedido;
import ws.Sucursal;

public class Main {

    public static Operaciones cliente;
    public static VPedido vista;

    public static void main(String[] args) {
        conectar();
        abrirPedido();
    }

    public static boolean conectar() {
        try {
            Operaciones_Service servicio = new Operaciones_Service();
            cliente = servicio.getOperacionesPort();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar al servidor", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static void abrirPedido() {
        vista = new VPedido();
        cargarMedicamentos();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        vista.getBtnEnviar().addActionListener(l -> crearPedido());

    }

   public static void cargarMedicamentos() {
    DefaultComboBoxModel<Medicamento> modelo = new DefaultComboBoxModel<>();

    ArrayList<Medicamento> medicamentos = (ArrayList<Medicamento>) cliente.getMedicamentos();

    if (!medicamentos.isEmpty()) {
        for (Medicamento m : medicamentos) {
            modelo.addElement(m);
        }
        
        // Configurar un CellRenderer personalizado para mostrar solo el nombre del Medicamento
        vista.getJcMedicamento().setModel(modelo);
        vista.getJcMedicamento().setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value instanceof Medicamento) {
                    value = ((Medicamento) value).getMedicamento();
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            }
        });
    }
}


public static int ultimo_id_pedido = 0;

    public static boolean crearPedido() {
        Pedido p = new Pedido();
        try {
            
            p.setCantidad((int) vista.getJsCantidad().getValue());
            p.setMedicamento((Medicamento) vista.getJcMedicamento().getSelectedItem());
            p.setSucursal((Sucursal) vista.getJcSucursal().getSelectedItem());
            //enviar pedido:
            ultimo_id_pedido++;
            p.setId(ultimo_id_pedido);
            cliente.setPedido(p);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

}
