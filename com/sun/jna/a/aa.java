/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.y;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

class aa
implements HierarchyListener {
    final /* synthetic */ Runnable a;
    final /* synthetic */ y b;

    aa(y y2, Runnable runnable) {
        this.b = y2;
        this.a = runnable;
    }

    public void hierarchyChanged(HierarchyEvent hierarchyEvent) {
        if ((hierarchyEvent.getChangeFlags() & 2L) != 0L && hierarchyEvent.getComponent().isDisplayable()) {
            hierarchyEvent.getComponent().removeHierarchyListener(this);
            this.a.run();
        }
    }
}

