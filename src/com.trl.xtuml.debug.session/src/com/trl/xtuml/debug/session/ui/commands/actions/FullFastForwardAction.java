package com.trl.xtuml.debug.session.ui.commands.actions;

import org.eclipse.debug.ui.actions.DebugCommandAction;
import org.eclipse.jface.resource.ImageDescriptor;
import com.trl.xtuml.debug.session.ui.commands.IFullFastForwardHandler;

/**
 * This action will fast forward the current program
 * pointer either one step in history, or if
 * configured as such to the end unless a
 * break point is set.  Note that values are not
 * re-evaluated yet re-applied from the execution
 * history.
 * 
 * @author travislondon
 *
 */
public class FullFastForwardAction extends DebugCommandAction {
	
	public FullFastForwardAction() {
		setActionDefinitionId("org.eclipse.debug.ui.commands.FullFastForward"); //$NON-NLS-1$
	}

	@Override
	public String getText() {
		return "Full Fast Forward";
	}

	@Override
	public String getId() {
		return "org.xtuml.bp.debug.ui.commands.actions.FullFastForward"; //$NON-NLS-1$
	}

	@Override
	protected Class<IFullFastForwardHandler> getCommandType() {
		return IFullFastForwardHandler.class;
	}

	@Override
	public String getHelpContextId() {
		/* Documentation will be in the Help section */
		return null;
	}

	@Override
	public String getToolTipText() {
		/* action name is fine */
		return "";
	}

	@Override
	public ImageDescriptor getDisabledImageDescriptor() {
		/* handled by the meta-data */
		return null;
	}

	@Override
	public ImageDescriptor getHoverImageDescriptor() {
		/* handled by the meta-data */
		return null;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		/* handled by the meta-data */
		return null;
	}
		
}
