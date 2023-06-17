/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.c;

import com.c.a.c.c;
import com.c.a.e;
import java.util.UUID;

public class f
extends c {
    private final e a;
    private final UUID b;
    private final String c;

    public f(e e2, UUID uUID, String string) {
        super("Decrypted textures payload was for another user (expected " + e2.a() + "/" + e2.b() + " but was for " + uUID + "/" + string + ")");
        this.a = e2;
        this.b = uUID;
        this.c = string;
    }
}

