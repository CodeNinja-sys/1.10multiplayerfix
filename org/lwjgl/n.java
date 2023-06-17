/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.apple.eio.FileManager
 */
package org.lwjgl;

import com.apple.eio.FileManager;
import java.awt.Toolkit;
import org.lwjgl.b;
import org.lwjgl.d;

final class n
extends b {
    private static final int a = 25;

    n() {
    }

    public int e() {
        return 25;
    }

    public boolean a(String string) {
        try {
            FileManager.openURL((String)string);
            return true;
        }
        catch (Exception exception) {
            d.a((CharSequence)("Exception occurred while trying to invoke browser: " + exception));
            return false;
        }
    }

    static {
        Toolkit.getDefaultToolkit();
    }
}

