/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.h.ab;

public class aa
extends ZipException {
    private static final long c = 20110809L;
    static final String a = "archive's size exceeds the limit of 4GByte.";
    static final String b = "archive contains more than 65535 entries.";

    static String a(ab ab2) {
        return ab2.getName() + "'s size exceeds the limit of 4GByte.";
    }

    public aa(String string) {
        super(string);
    }
}

