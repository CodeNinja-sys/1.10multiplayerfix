/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import org.lwjgl.opengl.MacOSXCanvasPeerInfo;

class hc
implements ComponentListener {
    final /* synthetic */ Canvas a;
    final /* synthetic */ MacOSXCanvasPeerInfo b;

    hc(MacOSXCanvasPeerInfo macOSXCanvasPeerInfo, Canvas canvas) {
        this.b = macOSXCanvasPeerInfo;
        this.a = canvas;
    }

    public void componentHidden(ComponentEvent componentEvent) {
    }

    public void componentMoved(ComponentEvent componentEvent) {
        MacOSXCanvasPeerInfo.a(this.a, this.b.h());
    }

    public void componentResized(ComponentEvent componentEvent) {
        MacOSXCanvasPeerInfo.a(this.a, this.b.h());
    }

    public void componentShown(ComponentEvent componentEvent) {
    }

    public String toString() {
        return "CanvasPeerInfoListener";
    }
}

