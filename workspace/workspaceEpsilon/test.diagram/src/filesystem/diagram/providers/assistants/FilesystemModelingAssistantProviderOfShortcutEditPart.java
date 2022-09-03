/*
 * 
 */
package filesystem.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import filesystem.diagram.edit.parts.Drive2EditPart;
import filesystem.diagram.edit.parts.DriveEditPart;
import filesystem.diagram.edit.parts.FileEditPart;
import filesystem.diagram.edit.parts.FolderEditPart;
import filesystem.diagram.edit.parts.ShortcutEditPart;
import filesystem.diagram.providers.FilesystemElementTypes;
import filesystem.diagram.providers.FilesystemModelingAssistantProvider;

/**
 * @generated
 */
public class FilesystemModelingAssistantProviderOfShortcutEditPart extends FilesystemModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ShortcutEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ShortcutEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FilesystemElementTypes.Sync_4001);
		types.add(FilesystemElementTypes.ShortcutTarget_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ShortcutEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ShortcutEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DriveEditPart) {
			types.add(FilesystemElementTypes.Sync_4001);
		}
		if (targetEditPart instanceof Drive2EditPart) {
			types.add(FilesystemElementTypes.Sync_4001);
		}
		if (targetEditPart instanceof FolderEditPart) {
			types.add(FilesystemElementTypes.Sync_4001);
		}
		if (targetEditPart instanceof ShortcutEditPart) {
			types.add(FilesystemElementTypes.Sync_4001);
		}
		if (targetEditPart instanceof FileEditPart) {
			types.add(FilesystemElementTypes.Sync_4001);
		}
		if (targetEditPart instanceof DriveEditPart) {
			types.add(FilesystemElementTypes.ShortcutTarget_4002);
		}
		if (targetEditPart instanceof Drive2EditPart) {
			types.add(FilesystemElementTypes.ShortcutTarget_4002);
		}
		if (targetEditPart instanceof FolderEditPart) {
			types.add(FilesystemElementTypes.ShortcutTarget_4002);
		}
		if (targetEditPart instanceof ShortcutEditPart) {
			types.add(FilesystemElementTypes.ShortcutTarget_4002);
		}
		if (targetEditPart instanceof FileEditPart) {
			types.add(FilesystemElementTypes.ShortcutTarget_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ShortcutEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ShortcutEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FilesystemElementTypes.Sync_4001) {
			types.add(FilesystemElementTypes.Drive_2001);
			types.add(FilesystemElementTypes.Drive_3001);
			types.add(FilesystemElementTypes.Folder_3002);
			types.add(FilesystemElementTypes.Shortcut_3003);
			types.add(FilesystemElementTypes.File_3004);
		} else if (relationshipType == FilesystemElementTypes.ShortcutTarget_4002) {
			types.add(FilesystemElementTypes.Drive_2001);
			types.add(FilesystemElementTypes.Drive_3001);
			types.add(FilesystemElementTypes.Folder_3002);
			types.add(FilesystemElementTypes.Shortcut_3003);
			types.add(FilesystemElementTypes.File_3004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ShortcutEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ShortcutEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FilesystemElementTypes.Sync_4001);
		types.add(FilesystemElementTypes.ShortcutTarget_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ShortcutEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ShortcutEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FilesystemElementTypes.Sync_4001) {
			types.add(FilesystemElementTypes.Drive_2001);
			types.add(FilesystemElementTypes.Drive_3001);
			types.add(FilesystemElementTypes.Folder_3002);
			types.add(FilesystemElementTypes.Shortcut_3003);
			types.add(FilesystemElementTypes.File_3004);
		} else if (relationshipType == FilesystemElementTypes.ShortcutTarget_4002) {
			types.add(FilesystemElementTypes.Shortcut_3003);
		}
		return types;
	}

}