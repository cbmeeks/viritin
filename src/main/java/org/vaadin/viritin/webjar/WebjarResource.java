/*
 * Copyright 2015 Matti Tahvonen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.viritin.webjar;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author Matti Tahvonen
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface WebjarResource {

    /**
     * @return Webjar artifact(s) to be attached to the host page. E.g.
     * "jquery/1.11.1/jquery.min.js". JS and CSS files are currently supported.
     */
    public String[] value();
}
