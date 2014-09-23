/*
 * Copyright (C) 2009-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package akka.http.model.japi;

import akka.stream.scaladsl2.FlowWithSource;
import akka.util.ByteString;

/**
 * Represents an entity without a predetermined content-length to use in a BodyParts.
 */
public abstract class HttpEntityIndefiniteLength implements BodyPartEntity {
    public abstract FlowWithSource<?, ByteString> data();
}