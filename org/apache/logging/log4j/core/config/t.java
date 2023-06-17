/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.databind.JsonNode
 */
package org.apache.logging.log4j.core.config;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.logging.log4j.core.config.r;
import org.apache.logging.log4j.core.config.s;

class t {
    private final JsonNode b;
    private final String c;
    private final s d;
    final /* synthetic */ r a;

    public t(r r2, String string, JsonNode jsonNode, s s2) {
        this.a = r2;
        this.c = string;
        this.b = jsonNode;
        this.d = s2;
    }

    static /* synthetic */ String a(t t2) {
        return t2.c;
    }

    static /* synthetic */ s b(t t2) {
        return t2.d;
    }
}

