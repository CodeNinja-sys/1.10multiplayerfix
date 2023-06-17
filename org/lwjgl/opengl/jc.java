/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.WindowsDisplay;

class jc
implements Runnable {
    final /* synthetic */ WindowsDisplay a;

    jc(WindowsDisplay windowsDisplay) {
        this.a = windowsDisplay;
    }

    public void run() {
        WindowsDisplay.b(this.a);
    }
}

