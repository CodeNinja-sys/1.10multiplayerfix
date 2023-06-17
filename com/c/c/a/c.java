/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import org.apache.commons.b.e.e;

class c
extends e {
    private ActionListener b;
    final /* synthetic */ a a;

    public c(a a2, OutputStream outputStream) {
        this.a = a2;
        super(outputStream);
        this.b = null;
    }

    public void a(ActionListener actionListener) {
        this.b = actionListener;
    }

    @Override
    protected void a(int n2) {
        super.a(n2);
        if (this.b != null) {
            this.b.actionPerformed(new ActionEvent(this, 0, null));
        }
    }
}

