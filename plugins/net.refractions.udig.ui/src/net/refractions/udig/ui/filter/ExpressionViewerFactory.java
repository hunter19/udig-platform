package net.refractions.udig.ui.filter;

import org.eclipse.core.internal.registry.ConfigurationElement;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.swt.widgets.Composite;
import org.opengis.filter.expression.Expression;

public class ExpressionViewerFactory {
    final int NOT_APPROPRIATE = 0; // value used to indicate FilterViewer cannot be used
    final int INCOMPLETE = 10;     // unable to display/edit all information
    final int COMPLETE = 30;       // Used for DefaultFilterViewer offering direct CQL access
    final int APPROPRIATE = 50;    // Used for general purpose 
    final int FRIENDLY = 70;       // Sensible defaults such as fill in the blank predefined query
    final int PERFECT = 100;       // Exact match often offering visual graphical chooser

    /** Configuration from extension point of things like display name and binding */
    public void init( ConfigurationElement config ){}

    public String getDisplayName(){
        return null;}
    /** Expected Expression value example using either Literal (Color, Integer) or Filter class PropertyName */
    public Class<?> getBinding(){
        return null;}
    /** Percentage between 0-100 saying how well this viewer can process the provided object */
    public int appropriate( Expression expr ){
        return APPROPRIATE;}
    public IExpressionViewer createViewer( Composite composite, int style ){
        return null;}


  }