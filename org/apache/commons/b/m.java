/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.File;
import java.io.IOException;

public class m
extends IOException {
    private static final long a = 1L;

    public m() {
    }

    public m(String string) {
        super(string);
    }

    public m(File file) {
        super("File " + file + " exists");
    }
}

