package omoikane.caja.presentation;

/**
 * Sample Skeleton for "Caja.fxml" Controller Class
 * You can copy and paste this code into your favorite IDE
 **/

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ListChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import omoikane.caja.business.ICajaLogic;


public class CajaController
        implements Initializable {

    private CajaModel modelo;
    private ICajaLogic cajaLogic;

    @FXML
    private Button buscarProductoButton;

    @FXML
    private Label cajaLabel;

    @FXML
    private TextField cambioTextField;

    @FXML
    private Button cancelarArtículoButton;

    @FXML
    private Button cancelarVentaButton;

    @FXML
    private TextField capturaTextField;

    @FXML
    private Label descuentoLabel;

    @FXML
    private TextField efectivoTextField;

    @FXML
    private Label fechaLabel;

    @FXML
    private Label impuestosLabel;

    @FXML
    private Button movimientosButton;

    @FXML
    private Label nArticulosLabel;

    @FXML
    private Button pausarButton;

    @FXML
    private TableView<?> productosTableView;

    @FXML
    private Label subtotalLabel;

    @FXML
    private Button terminarVentaButton;

    @FXML
    private Label totalLabel;

    @FXML
    private Button ventaEspecialButton;

    @FXML
    private TableView<ProductoModel> ventaTableView;

    @FXML private TableColumn<ProductoModel, String> conceptoVentaColumn;
    @FXML private TableColumn cantidadVentaColumn;
    @FXML private TableColumn precioVentaColumn;
    @FXML private TableColumn importeVentaColumn;

    @FXML
    private void onCapturaKeyReleased(KeyEvent event) {
        if ( event.getCode() == KeyCode.ENTER ) {
            getCajaLogic().captura( modelo );
        }
    }


    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert buscarProductoButton != null : "fx:id=\"buscarProductoButton\" was not injected: check your FXML file 'Caja.fxml'.";
        assert cajaLabel != null : "fx:id=\"cajaLabel\" was not injected: check your FXML file 'Caja.fxml'.";
        assert cambioTextField != null : "fx:id=\"cambioTextField\" was not injected: check your FXML file 'Caja.fxml'.";
        assert cancelarArtículoButton != null : "fx:id=\"cancelarArtículoButton\" was not injected: check your FXML file 'Caja.fxml'.";
        assert cancelarVentaButton != null : "fx:id=\"cancelarVentaButton\" was not injected: check your FXML file 'Caja.fxml'.";
        assert capturaTextField != null : "fx:id=\"capturaTextField\" was not injected: check your FXML file 'Caja.fxml'.";
        assert descuentoLabel != null : "fx:id=\"descuentoLabel\" was not injected: check your FXML file 'Caja.fxml'.";
        assert efectivoTextField != null : "fx:id=\"efectivoTextField\" was not injected: check your FXML file 'Caja.fxml'.";
        assert fechaLabel != null : "fx:id=\"fechaLabel\" was not injected: check your FXML file 'Caja.fxml'.";
        assert impuestosLabel != null : "fx:id=\"impuestosLabel\" was not injected: check your FXML file 'Caja.fxml'.";
        assert movimientosButton != null : "fx:id=\"movimientosButton\" was not injected: check your FXML file 'Caja.fxml'.";
        assert nArticulosLabel != null : "fx:id=\"nArticulosLabel\" was not injected: check your FXML file 'Caja.fxml'.";
        assert pausarButton != null : "fx:id=\"pausarButton\" was not injected: check your FXML file 'Caja.fxml'.";
        assert productosTableView != null : "fx:id=\"productosTableView\" was not injected: check your FXML file 'Caja.fxml'.";
        assert subtotalLabel != null : "fx:id=\"subtotalLabel\" was not injected: check your FXML file 'Caja.fxml'.";
        assert terminarVentaButton != null : "fx:id=\"terminarVentaButton\" was not injected: check your FXML file 'Caja.fxml'.";
        assert totalLabel != null : "fx:id=\"totalLabel\" was not injected: check your FXML file 'Caja.fxml'.";
        assert ventaEspecialButton != null : "fx:id=\"ventaEspecialButton\" was not injected: check your FXML file 'Caja.fxml'.";
        assert ventaTableView != null : "fx:id=\"ventaTableView\" was not injected: check your FXML file 'Caja.fxml'.";

        // initialize your logic here: all @FXML variables will have been injected
        conceptoVentaColumn     .prefWidthProperty().bind( ventaTableView.widthProperty().multiply(0.545d) );
        cantidadVentaColumn     .prefWidthProperty().bind( ventaTableView.widthProperty().multiply(0.15d) );
        precioVentaColumn       .prefWidthProperty().bind( ventaTableView.widthProperty().multiply(0.15d) );
        importeVentaColumn.prefWidthProperty().bind( ventaTableView.widthProperty().multiply(0.15d) );

    }

    public void setModel(final CajaModel modelo) {
        this.modelo = modelo;

        //Bindings
        capturaTextField.textProperty().bindBidirectional(modelo.getCaptura());

        //Setup table view and table model
        ventaTableView.setItems(modelo.getProductos());
        conceptoVentaColumn.setCellValueFactory(
                new PropertyValueFactory<ProductoModel, String>("conceptoString")
        );
        cantidadVentaColumn.setCellValueFactory(
                new PropertyValueFactory<ProductoModel, String>("cantidadString")
        );
        precioVentaColumn.setCellValueFactory(
                new PropertyValueFactory<ProductoModel, String>("precioString")
        );
        importeVentaColumn.setCellValueFactory(
                new PropertyValueFactory<ProductoModel, String>("importeString")
        );

        nArticulosLabel.textProperty().set( modelo.getProductos().size() + " artículo(s)" );
        ventaTableView.getItems().addListener(new ListChangeListener<ProductoModel>() {
            @Override
            public void onChanged(Change<? extends ProductoModel> change) {
                nArticulosLabel.textProperty().set( modelo.getProductos().size() + " artículo(s)" );
            }
        });
    }

    public ICajaLogic getCajaLogic() {
        return cajaLogic;
    }

    public void setCajaLogic(ICajaLogic cajaLogic) {
        this.cajaLogic = cajaLogic;
    }
}