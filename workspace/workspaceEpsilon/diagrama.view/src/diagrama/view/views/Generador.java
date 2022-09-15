package diagrama.view.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;

import diagrama.model.ModelFactoryModel;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import javax.inject.Inject;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class Generador extends ViewPart {
	public Generador() {
	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "diagrama.view.views.Generador";
	private Button btnGenerateM2T;

	 

	
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(null);
		
		Group grpGeneracinDeModelo2M = new Group(parent, SWT.NONE);
		grpGeneracinDeModelo2M.setText("Generaci\u00F3n de modelo a modelo");
		grpGeneracinDeModelo2M.setBounds(10, 10, 562, 120);
		
		Button btnGenerateM2M = new Button(grpGeneracinDeModelo2M, SWT.NONE);
		
		btnGenerateM2M.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.generarModelToModel();
			}
		});
		btnGenerateM2M.setBounds(116, 45, 334, 38);
		btnGenerateM2M.setText("Generate M2M");
		
		Group grpGeneracinDeModelo2T = new Group(parent, SWT.NONE);
		grpGeneracinDeModelo2T.setText("Generaci\u00F3n de modelo a texto");
		grpGeneracinDeModelo2T.setBounds(10, 137, 562, 120);
		
		btnGenerateM2T = new Button(grpGeneracinDeModelo2T, SWT.NONE);
		btnGenerateM2T.setText("Generate M2T");
		btnGenerateM2T.setBounds(116, 45, 334, 38);
		
		Group grpLimpiarProduccin = new Group(parent, SWT.NONE);
		grpLimpiarProduccin.setText("Limpiar producci\u00F3n");
		grpLimpiarProduccin.setBounds(10, 260, 562, 120);
		
		Button btnLimpiar = new Button(grpLimpiarProduccin, SWT.NONE);
		btnLimpiar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.limpiarProduccion();
			}
		});
		btnLimpiar.setText("Limpiar");
		btnLimpiar.setBounds(116, 45, 334, 38);
		
	}

	

	@Override
	public void setFocus() {
		
	}
}