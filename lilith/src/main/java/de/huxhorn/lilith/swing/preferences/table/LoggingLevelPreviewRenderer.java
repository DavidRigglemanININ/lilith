/*
 * Lilith - a log event viewer.
 * Copyright (C) 2007-2017 Joern Huxhorn
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

package de.huxhorn.lilith.swing.preferences.table;

import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.lilith.swing.table.ColorScheme;
import java.util.Map;
import javax.swing.JTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingLevelPreviewRenderer
	extends ColorSchemePreviewRenderer
{
	private final Logger logger = LoggerFactory.getLogger(LoggingLevelPreviewRenderer.class);

	private Map<LoggingEvent.Level, ColorScheme> schemes;

	void setSchemes(Map<LoggingEvent.Level, ColorScheme> schemes)
	{
		this.schemes = schemes;
	}

	@Override
	public ColorScheme resolveColorScheme(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	{
		ColorScheme result = null;
		if(value instanceof LoggingEvent.Level)
		{
			LoggingEvent.Level level = (LoggingEvent.Level) value;
			if(schemes == null)
			{
				if(logger.isWarnEnabled()) logger.warn("No color schemes defined for logging levels!");
			}
			else
			{
				result = schemes.get(level);
			}
		}
		return result;
	}

	@Override
	public void updateText(JTable table, Object value, boolean selected, boolean hasFocus, int row, int column)
	{
		String text="";
		String toolTip="";

		if(value instanceof LoggingEvent.Level)
		{
			LoggingEvent.Level level = (LoggingEvent.Level)value;
			text=level.name();
			toolTip=level.name();
		}
		renderer.setText(text);
		renderer.setToolTipText(toolTip);
	}
}
