/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.b;

import java.util.Arrays;

class h {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    long j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    String r;
    String s;
    byte[] t = null;

    h() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MainHeader [archiverVersionNumber=");
        stringBuilder.append(this.a);
        stringBuilder.append(", minVersionToExtract=");
        stringBuilder.append(this.b);
        stringBuilder.append(", hostOS=");
        stringBuilder.append(this.c);
        stringBuilder.append(", arjFlags=");
        stringBuilder.append(this.d);
        stringBuilder.append(", securityVersion=");
        stringBuilder.append(this.e);
        stringBuilder.append(", fileType=");
        stringBuilder.append(this.f);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.g);
        stringBuilder.append(", dateTimeCreated=");
        stringBuilder.append(this.h);
        stringBuilder.append(", dateTimeModified=");
        stringBuilder.append(this.i);
        stringBuilder.append(", archiveSize=");
        stringBuilder.append(this.j);
        stringBuilder.append(", securityEnvelopeFilePosition=");
        stringBuilder.append(this.k);
        stringBuilder.append(", fileSpecPosition=");
        stringBuilder.append(this.l);
        stringBuilder.append(", securityEnvelopeLength=");
        stringBuilder.append(this.m);
        stringBuilder.append(", encryptionVersion=");
        stringBuilder.append(this.n);
        stringBuilder.append(", lastChapter=");
        stringBuilder.append(this.o);
        stringBuilder.append(", arjProtectionFactor=");
        stringBuilder.append(this.p);
        stringBuilder.append(", arjFlags2=");
        stringBuilder.append(this.q);
        stringBuilder.append(", name=");
        stringBuilder.append(this.r);
        stringBuilder.append(", comment=");
        stringBuilder.append(this.s);
        stringBuilder.append(", extendedHeaderBytes=");
        stringBuilder.append(Arrays.toString(this.t));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

