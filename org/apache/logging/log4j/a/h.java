/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.util.ResourceBundle;
import org.apache.logging.log4j.a.a;
import org.apache.logging.log4j.a.g;
import org.apache.logging.log4j.a.m;

public class h
extends a {
    private final ResourceBundle a;
    private final String b;

    public h(ResourceBundle resourceBundle) {
        this.a = resourceBundle;
        this.b = null;
    }

    public h(String string) {
        this.a = null;
        this.b = string;
    }

    @Override
    public m a(String string, Object ... arrobject) {
        if (this.a == null) {
            return new g(this.b, string, arrobject);
        }
        return new g(this.a, string, arrobject);
    }
}

