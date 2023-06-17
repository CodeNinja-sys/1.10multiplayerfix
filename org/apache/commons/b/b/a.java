/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import org.apache.commons.b.b.n;

public abstract class a
implements n {
    @Override
    public boolean accept(File file) {
        return this.accept(file.getParentFile(), file.getName());
    }

    @Override
    public boolean accept(File file, String string) {
        return this.accept(new File(file, string));
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}

