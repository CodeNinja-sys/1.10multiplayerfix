/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.UUID;
import org.apache.logging.log4j.core.d.z;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class bd
extends ac {
    private final boolean b;

    private bd(boolean bl2) {
        super("u", "uuid");
        this.b = bl2;
    }

    public static bd a(String[] arrstring) {
        if (arrstring.length == 0) {
            return new bd(false);
        }
        if (arrstring.length > 1 || !arrstring[0].equalsIgnoreCase("RANDOM") && !arrstring[0].equalsIgnoreCase("Time")) {
            a.b("UUID Pattern Converter only accepts a single option with the value \"RANDOM\" or \"TIME\"");
        }
        return new bd(arrstring[0].equalsIgnoreCase("RANDOM"));
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        UUID uUID = this.b ? UUID.randomUUID() : z.a();
        stringBuilder.append(uUID.toString());
    }
}

