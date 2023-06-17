/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.b.b.a;
import org.apache.commons.b.o;

public class b
extends a
implements Serializable {
    private final long a;
    private final boolean b;

    public b(long l2) {
        this(l2, true);
    }

    public b(long l2, boolean bl2) {
        this.b = bl2;
        this.a = l2;
    }

    public b(Date date) {
        this(date, true);
    }

    public b(Date date, boolean bl2) {
        this(date.getTime(), bl2);
    }

    public b(File file) {
        this(file, true);
    }

    public b(File file, boolean bl2) {
        this(file.lastModified(), bl2);
    }

    @Override
    public boolean accept(File file) {
        boolean bl2 = o.a(file, this.a);
        return this.b ? !bl2 : bl2;
    }

    @Override
    public String toString() {
        String string = this.b ? "<=" : ">";
        return super.toString() + "(" + string + this.a + ")";
    }
}

