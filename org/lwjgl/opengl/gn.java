/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import org.lwjgl.opengl.LinuxDisplay;
import org.lwjgl.opengl.fz;

class gn
implements FocusListener {
    final /* synthetic */ LinuxDisplay a;

    gn(LinuxDisplay linuxDisplay) {
        this.a = linuxDisplay;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void focusGained(FocusEvent focusEvent) {
        Object object = fz.a;
        synchronized (object) {
            LinuxDisplay.a(this.a, true);
            LinuxDisplay.b(this.a, true);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void focusLost(FocusEvent focusEvent) {
        Object object = fz.a;
        synchronized (object) {
            LinuxDisplay.a(this.a, false);
            LinuxDisplay.b(this.a, true);
        }
    }
}

