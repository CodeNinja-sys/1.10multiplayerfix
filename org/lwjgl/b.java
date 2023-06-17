/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.lwjgl.DefaultSysImplementation;
import org.lwjgl.d;

abstract class b
extends DefaultSysImplementation {
    b() {
    }

    public long c() {
        return System.currentTimeMillis();
    }

    public void a(String string, String string2) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception exception) {
            d.a((CharSequence)("Caught exception while setting LAF: " + exception));
        }
        JOptionPane.showMessageDialog(null, string2, string, 2);
    }

    public String d() {
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            Transferable transferable = clipboard.getContents(null);
            if (transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String)transferable.getTransferData(DataFlavor.stringFlavor);
            }
        }
        catch (Exception exception) {
            d.a((CharSequence)("Exception while getting clipboard: " + exception));
        }
        return null;
    }
}

