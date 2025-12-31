/*
 * Jeffrey
 * Copyright (C) 2025 Petr Bouda
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cafe.jeffrey.jfr.events.log;

import jdk.jfr.*;

@Name(LogEvent.NAME)
@Label("Log Event")
@Description("A log message captured as a JFR event")
@Category({"Application", "Log"})
@StackTrace(false)
public class LogEvent extends Event {

    public static final String NAME = "jeffrey.Log";

    @Label("Message")
    @Description("The log message")
    public String message;

    @Label("Severity")
    @Description("The severity level of the log message")
    public Severity severity;

    @Label("Source")
    @Description("The component or module where the log message originated")
    public String source;
}
