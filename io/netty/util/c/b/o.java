/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.slf4j.LoggerFactory
 *  org.slf4j.helpers.NOPLoggerFactory
 */
package io.netty.util.c.b;

import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.b.n;
import io.netty.util.c.b.p;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLoggerFactory;

public class o
extends h {
    public o() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    o(boolean bl2) {
        assert (bl2);
        StringBuffer stringBuffer = new StringBuffer();
        PrintStream printStream = System.err;
        try {
            System.setErr(new PrintStream((OutputStream)new p(this, stringBuffer), true, "US-ASCII"));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new Error(unsupportedEncodingException);
        }
        try {
            if (LoggerFactory.getILoggerFactory() instanceof NOPLoggerFactory) {
                throw new NoClassDefFoundError(stringBuffer.toString());
            }
            printStream.print(stringBuffer);
            printStream.flush();
        }
        finally {
            System.setErr(printStream);
        }
    }

    @Override
    public g a(String string) {
        return new n(LoggerFactory.getLogger((String)string));
    }
}

