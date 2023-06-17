/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.mail.Authenticator
 *  javax.mail.PasswordAuthentication
 */
package org.apache.logging.log4j.core.net;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import org.apache.logging.log4j.core.net.ab;

class ac
extends Authenticator {
    private final PasswordAuthentication d;
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ ab c;

    ac(ab ab2, String string, String string2) {
        this.c = ab2;
        this.a = string;
        this.b = string2;
        this.d = new PasswordAuthentication(this.a, this.b);
    }

    protected PasswordAuthentication a() {
        return this.d;
    }
}

