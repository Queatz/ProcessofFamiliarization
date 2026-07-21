package app.processoffamiliarization.web

import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.boxSizing
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.fontFamily
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.margin
import org.jetbrains.compose.web.css.marginBottom
import org.jetbrains.compose.web.css.maxWidth
import org.jetbrains.compose.web.css.media
import org.jetbrains.compose.web.css.minHeight
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.variable
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.css.value
import org.jetbrains.compose.web.css.CSSColorValue

/**
 * Design tokens exposed as CSS custom properties so light/dark themes
 * can swap values without rewriting component styles.
 */
object AppCSSVariables {
    val colorBackground by variable<CSSColorValue>()
    val colorOnBackground by variable<CSSColorValue>()
    val colorSurface by variable<CSSColorValue>()
    val colorOnSurface by variable<CSSColorValue>()
    val colorPrimary by variable<CSSColorValue>()
    val colorOnPrimary by variable<CSSColorValue>()
    val colorBorder by variable<CSSColorValue>()
    val colorMuted by variable<CSSColorValue>()
}

object Styles : StyleSheet() {
    init {
        // Light theme (default)
        "html" style {
            AppCSSVariables.colorBackground(Color("#FAFAFA"))
            AppCSSVariables.colorOnBackground(Color("#1A1A1A"))
            AppCSSVariables.colorSurface(Color("#FFFFFF"))
            AppCSSVariables.colorOnSurface(Color("#1A1A1A"))
            AppCSSVariables.colorPrimary(Color("#2563EB"))
            AppCSSVariables.colorOnPrimary(Color("#FFFFFF"))
            AppCSSVariables.colorBorder(Color("#E5E7EB"))
            AppCSSVariables.colorMuted(Color("#6B7280"))

            // Lets native controls (scrollbars, form fields) follow the theme.
            property("color-scheme", "light dark")
        }

        // Dark theme via system preference
        media("(prefers-color-scheme: dark)") {
            "html" style {
                AppCSSVariables.colorBackground(Color("#0F1115"))
                AppCSSVariables.colorOnBackground(Color("#E8EAED"))
                AppCSSVariables.colorSurface(Color("#1A1D24"))
                AppCSSVariables.colorOnSurface(Color("#E8EAED"))
                AppCSSVariables.colorPrimary(Color("#60A5FA"))
                AppCSSVariables.colorOnPrimary(Color("#0F1115"))
                AppCSSVariables.colorBorder(Color("#2E3440"))
                AppCSSVariables.colorMuted(Color("#9CA3AF"))
            }
        }

        "html, body" style {
            height(100.percent)
            width(100.percent)
            margin(0.px)
            padding(0.px)
            backgroundColor(AppCSSVariables.colorBackground.value())
            color(AppCSSVariables.colorOnBackground.value())
            fontFamily(
                "system-ui",
                "-apple-system",
                "BlinkMacSystemFont",
                "Segoe UI",
                "Roboto",
                "Helvetica Neue",
                "Arial",
                "sans-serif",
            )
            fontSize(16.px)
            property("line-height", "1.5")
            property("-webkit-font-smoothing", "antialiased")
            property("-moz-osx-font-smoothing", "grayscale")
        }

        "*, *::before, *::after" style {
            boxSizing("border-box")
        }

        "h1, h2, h3, h4, h5, h6, p" style {
            margin(0.px)
        }

        "button, input, textarea, select" style {
            fontFamily("inherit")
            fontSize(100.percent)
        }

        "a" style {
            color(AppCSSVariables.colorPrimary.value())
        }
    }

    val appRoot by style {
        minHeight(100.vh)
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        backgroundColor(AppCSSVariables.colorBackground.value())
        color(AppCSSVariables.colorOnBackground.value())
    }

    val page by style {
        width(100.percent)
        maxWidth(720.px)
        margin(0.px)
        property("margin-left", "auto")
        property("margin-right", "auto")
        padding(48.px, 24.px)
    }

    val title by style {
        fontSize(28.px)
        fontWeight(700)
        marginBottom(12.px)
        color(AppCSSVariables.colorOnBackground.value())
    }

    val subtitle by style {
        fontSize(16.px)
        color(AppCSSVariables.colorMuted.value())
        marginBottom(24.px)
    }

    val card by style {
        backgroundColor(AppCSSVariables.colorSurface.value())
        color(AppCSSVariables.colorOnSurface.value())
        property("border-width", "1px")
        property("border-style", "solid")
        property("border-color", AppCSSVariables.colorBorder.value())
        borderRadius(12.px)
        padding(20.px)
    }
}
