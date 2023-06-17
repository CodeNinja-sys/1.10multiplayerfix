/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.ha;

class hb
implements Runnable {
    final /* synthetic */ ha a;

    hb(ha ha2) {
        this.a = ha2;
    }

    public void run() {
        ha.a(this.a).removeComponentListener(this.a);
        ha.a(this.a).removeHierarchyListener(this.a);
    }
}

