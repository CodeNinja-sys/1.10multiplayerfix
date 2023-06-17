/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.WindowsDisplay;

class jd
implements Runnable {
    final /* synthetic */ WindowsDisplay a;

    jd(WindowsDisplay windowsDisplay) {
        this.a = windowsDisplay;
    }

    public void run() {
        WindowsDisplay.c(this.a).requestFocus();
    }
}

