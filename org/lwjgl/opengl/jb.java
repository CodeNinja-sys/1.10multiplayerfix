/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import org.lwjgl.opengl.WindowsDisplay;

class jb
extends FocusAdapter {
    final /* synthetic */ WindowsDisplay a;

    jb(WindowsDisplay windowsDisplay) {
        this.a = windowsDisplay;
    }

    public void focusGained(FocusEvent focusEvent) {
        WindowsDisplay.a(this.a).set(true);
        WindowsDisplay.b(this.a);
    }
}

