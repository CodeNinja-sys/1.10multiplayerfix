/*
 * Decompiled with CFR 0.150.
 */
package com.c.b;

import com.a.a.b.cm;
import com.c.b.b;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.spi.InitialContextFactory;

public class c
implements InitialContextFactory {
    private final cm a;
    private final InitialContextFactory b;

    public c(cm cm2, InitialContextFactory initialContextFactory) {
        this.a = cm2;
        this.b = initialContextFactory;
    }

    public Context getInitialContext(Hashtable hashtable) {
        return new b(this.a, (DirContext)this.b.getInitialContext(hashtable));
    }
}

