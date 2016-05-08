/*
 * Lilith - a log event viewer.
 * Copyright (C) 2007-2016 Joern Huxhorn
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.huxhorn.lilith.debug.exceptions;

public class CauseCauseCauseException
		extends RuntimeException
{
	private static final long serialVersionUID = 367699058673776515L;

	public CauseCauseCauseException()
	{
	}

	public CauseCauseCauseException(String message)
	{
		super(message);
	}

	public CauseCauseCauseException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public CauseCauseCauseException(Throwable cause)
	{
		super(cause);
	}

	public CauseCauseCauseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}
}