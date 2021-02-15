@file:JsModule("native-base")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

package ojaynico.kotlin.native.base

import ojaynico.kotlin.react.native.*
import kotlin.js.*
import react.Component
import react.RProps
import react.RState

external interface Testable {
    var testID: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ContainerProps: RProps, Testable {
    var theme: Any?
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class Container : Component<ContainerProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface HeaderProps : RProps, Testable {
    var searchBar: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rounded: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var hasTabs: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noShadow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasSubtitle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var span: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var androidStatusBarColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var iosBarStyle: dynamic?
        get() = definedExternally
        set(value) = definedExternally
    var hasSegment: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var translucent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var transparent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noLeft: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class Header : Component<HeaderProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface LeftProps : RProps, Testable {
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class Left : Component<LeftProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface RightProps : RProps, Testable {
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class Right : Component<RightProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface BodyProps : RProps, Testable {
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class Body : Component<BodyProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface ContentProps : RProps, Testable {
    var refreshing: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var theme: Any?
        get() = definedExternally
        set(value) = definedExternally
    var padder: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableKBDismissScroll: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enableResetScrollToCoords: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scrollEnabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var contentContainerStyle: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class Content : Component<ContentProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface FooterTabProps : RProps, Testable {
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class FooterTab : Component<FooterTabProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface FooterProps : RProps, Testable {
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class Footer : Component<FooterProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface TitleProps : RProps, Testable {
    var style: dynamic?
        get() = definedExternally
        set(value) = definedExternally
}

external class Title : Component<TitleProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface SubtitleProps : RProps, Testable {
    var style: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

external class Subtitle : Component<SubtitleProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface ButtonProps : RProps, TouchableOpacityProps, Testable {
    override var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: dynamic?
        get() = definedExternally
        set(value) = definedExternally
    override var onPress: () -> Unit
    var block: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var vertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var badge: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var transparent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var bordered: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rounded: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var small: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var iconLeft: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var iconRight: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputButton: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var full: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var light: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var dark: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var androidRippleColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var first: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var last: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasText: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class Button : Component<ButtonProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface ViewProps : RProps, ojaynico.kotlin.react.native.TextProps {
    var padder: Boolean?
}

external class View : Component<ViewProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface TextProps : RProps, ojaynico.kotlin.react.native.TextProps {
    var note: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var uppercase: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class Text : Component<TextProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface SwitchProps : RProps, Testable {

}

external class Switch : Component<SwitchProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface PickerProps : RProps, Testable {
    var mode: String? /* "dialog" | "dropdown" */
        get() = definedExternally
        set(value) = definedExternally
    var supportedOrientations: String? /* "portrait" | "landscape" */
        get() = definedExternally
        set(value) = definedExternally
    var iosHeader: String?
        get() = definedExternally
        set(value) = definedExternally
    var inlineLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var headerBackButtonText: String?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var placeholderStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var iosIcon: Any?
        get() = definedExternally
        set(value) = definedExternally
    var note: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var placeholderIconColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var itemTextStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var headerStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var headerTitleStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var headerBackButtonTextStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var modalStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var renderHeader: ((backAction: Any) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PickerItemProps : RProps, Testable {

}

external class Picker : Component<PickerProps, RState> {

    class Item : Component<PickerItemProps, RState> {
        override fun render(): dynamic = definedExternally
    }

    override fun render(): dynamic = definedExternally
}

external interface ListProps : RProps, Testable {
    var listBorderColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var listDividerBg: String?
        get() = definedExternally
        set(value) = definedExternally
    var listNoteColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var listItemPadding: Number?
        get() = definedExternally
        set(value) = definedExternally
    var listNoteSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inset: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var dataArray: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var renderItem: ((item: Any, index: dynamic /* String | Number */) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var renderRow: ((rowData: Any, sectionID: dynamic /* String | Number */, rowID: dynamic /* String | Number */, highlightRow: Boolean) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var dataSource: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disableLeftSwipe: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableRightSwipe: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rightOpenValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var keyExtractor: ((item: Any, index: Number) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var leftOpenValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var renderRightHiddenRow: ((rowData: Any, sectionID: dynamic /* String | Number */, rowID: dynamic /* String | Number */, rowMap: Any) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var renderLeftHiddenRow: ((rowData: Any, sectionID: dynamic /* String | Number */, rowID: dynamic /* String | Number */, rowMap: Any) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var rowHasChanged: ((r1: Any, r2: Any) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var onRowOpen: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onRowClose: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onRowDidOpen: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onRowDidClose: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var swipeToOpenPercent: Number?
        get() = definedExternally
        set(value) = definedExternally
    var closeOnRowBeginSwipe: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class List : Component<ListProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface ListItemProps : TouchableOpacityProps, RProps, Testable {
    var header: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noBorder: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noIndent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var iconRight: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var iconLeft: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var avatar: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var thumbnail: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var button: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var itemDivider: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var note: String?
        get() = definedExternally
        set(value) = definedExternally
    var itemHeader: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var first: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var last: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selected: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var androidRippleColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var touchableHighlightStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var underlayColor: String?
        get() = definedExternally
        set(value) = definedExternally
}

external class ListItem : Component<ListItemProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface H1Props : ojaynico.kotlin.react.native.TextProps, RProps

external class H1 : Component<H1Props, RState> {
    override fun render(): dynamic = definedExternally
}

external interface H2Props : ojaynico.kotlin.react.native.TextProps, RProps

external class H2 : Component<H2Props, RState> {
    override fun render(): dynamic = definedExternally
}

external interface H3Props : ojaynico.kotlin.react.native.TextProps, RProps

external class H3 : Component<H3Props, RState> {
    override fun render(): dynamic = definedExternally
}

external interface RowProps : ojaynico.kotlin.react.native.ViewProps, RProps {
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external class Row : Component<RowProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface ColProps : ojaynico.kotlin.react.native.ViewProps, RProps {
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external class Col : Component<ColProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface GridProps : ojaynico.kotlin.react.native.ViewProps, RProps

external class Grid : Component<GridProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface InputGroupProps : ojaynico.kotlin.react.native.ViewProps, RProps {
    var borderType: String? /* "rounded" | "regular" | "underline" */
        get() = definedExternally
        set(value) = definedExternally
    var toolbar: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var atoolbar: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var iconRight: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var success: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var error: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var regular: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var underline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rounded: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class InputGroup : Component<InputGroupProps, RState> {
    companion object {
        var propTypes: Any
    }

    override fun render(): dynamic = definedExternally
}

external interface InputProps : TextInputProps, RProps, Testable {
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var inlineLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stackedLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var getRef: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external class Input : Component<InputProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface TextareaProps : TextInputProps, RProps, Testable {
    var rowSpan: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bordered: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var underline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class Textarea : Component<TextareaProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface IconProps : RProps, Testable {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "AntDesign" | "Entypo" | "EvilIcons" | "Feather" | "FontAwesome" | "FontAwesome5" | "Foundation" | "Ionicons" | "MaterialCommunityIcons" | "MaterialIcons" | "Octicons" | "SimpleLineIcons" | "Zocial" */
        get() = definedExternally
        set(value) = definedExternally
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onPress: ((e: Any) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ios: String?
        get() = definedExternally
        set(value) = definedExternally
    var android: String?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var solid: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var light: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class Icon : Component<IconProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface ThumbnailProps : ImageProps, RProps {
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var circular: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var square: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var small: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class Thumbnail : Component<ThumbnailProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface CardProps : ojaynico.kotlin.react.native.ViewProps, RProps {
    var dataArray: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var ref: Any?
        get() = definedExternally
        set(value) = definedExternally
    var transparent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noShadow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enableEmptySections: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var initialListSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var onChangeVisibleRows: ((visibleRows: Array<dynamic>, changedRows: Array<dynamic>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onEndReached: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onEndReachedThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pageSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var renderFooter: (() -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var renderHeader: (() -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var renderRow: ((rowData: Any, sectionID: dynamic /* String | Number */, rowID: dynamic /* String | Number */, highlightRow: Boolean) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var renderScrollComponent: ((props: dynamic) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var renderSectionHeader: ((sectionData: Any, sectionId: dynamic /* String | Number */) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var renderSeparator: ((sectionID: dynamic /* String | Number */, rowID: dynamic /* String | Number */, adjacentRowHighlighted: Boolean) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var scrollRenderAheadDistance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stickyHeaderIndices: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var stickySectionHeadersEnabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class Card : Component<CardProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface CardItemProps : TouchableOpacityProps, RProps, Testable {
    var header: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var footer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cardBody: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var button: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bordered: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var first: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var last: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class CardItem : Component<CardItemProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface CardSwiperProps : RProps, Testable

external class CardSwiper : Component<CardSwiperProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface DeckSwiperProps : RProps, Testable {
    var dataSource: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onSwipeLeft: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onSwipeRight: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var renderItem: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var renderBottom: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var renderEmpty: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
}

external class DeckSwiper : Component<DeckSwiperProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface BsStyle {
    var success: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var primary: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var danger: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var warning: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var info: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BadgeProps : ojaynico.kotlin.react.native.ViewProps, BsStyle, RProps

external class Badge : Component<BadgeProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface SpinnerProps : ActivityIndicatorProps, RProps, Testable {
    var inverse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class Spinner : Component<SpinnerProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface CheckBoxProps : TouchableOpacityProps, RProps, Testable {
    var checked: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
}

external class CheckBox : Component<CheckBoxProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface RadioProps : TouchableOpacityProps, Testable {
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var selected: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selectedColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var standardStyle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class Radio : Component<RadioProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface ProgressBarProps : RProps, Testable {
    var progress: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var inverse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class ProgressBar : Component<ProgressBarProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface DrawerStyles : Testable {
    var drawer: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var main: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var drawerOverlay: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var mainOverlay: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface DrawerProps : RProps, Testable {
    var acceptDoubleTap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var acceptPan: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var acceptTap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var captureGestures: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    var open: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var closedDrawerOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var content: Any?
        get() = definedExternally
        set(value) = definedExternally
    var deviceScreen: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var initializeOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var negotiatePan: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onClose: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onCloseStart: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onOpen: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onOpenStart: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var openDrawerOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var openDrawerThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var panCloseMask: Number?
        get() = definedExternally
        set(value) = definedExternally
    var panOpenMask: Number?
        get() = definedExternally
        set(value) = definedExternally
    var panStartCompensation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var relativeDrag: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var side: String? /* "left" | "right" */
        get() = definedExternally
        set(value) = definedExternally
    var styles: DrawerStyles?
        get() = definedExternally
        set(value) = definedExternally
    var tapToClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tweenDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tweenEasing: String?
        get() = definedExternally
        set(value) = definedExternally
    var tweenHandler: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "overlay" | "static" | "displace" */
        get() = definedExternally
        set(value) = definedExternally
}

external class Drawer : Component<DrawerProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface ScrollableTabProps : RProps, Testable {
    var goToPage: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var activeTab: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tabs: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var activeTextColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var inactiveTextColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var scrollOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var tabStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var tabsContainerStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var renderTab: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var underlineStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onScroll: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
}

external class ScrollableTab : Component<ScrollableTabProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface TabsProps : RProps, Testable {
    var renderTabBar: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var tabBarPosition: String? /* "top" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    var edgeHitWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var springTension: Number?
        get() = definedExternally
        set(value) = definedExternally
    var springFriction: Number?
        get() = definedExternally
        set(value) = definedExternally
    var onChangeTab: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onScroll: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var page: Number?
        get() = definedExternally
        set(value) = definedExternally
    var locked: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var initialPage: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tabBarUnderlineStyle: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var tabBarBackgroundColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var tabBarActiveTextColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var tabBarInactiveTextColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var tabBarTextStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var tabContainerStyle: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var contentProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var scrollWithoutAnimation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var prerenderingSiblingsNumber: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external class Tabs : Component<TabsProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface TabProps : RProps, Testable {
    var heading: dynamic /* React.ReactElement<TabHeading> | String */
        get() = definedExternally
        set(value) = definedExternally
    var tabStyle: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var activeTabStyle: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var activeTextStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

external class Tab : Component<TabProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface TabHeadingProps : RProps, Testable {
    var tabStyle: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var activeTabStyle: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var activeTextStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class TabHeading : Component<TabHeadingProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface ItemProps : RProps, Testable {
    var onPress: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var fixedLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var floatingLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inlineLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stackedLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var placeholderLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bordered: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var regular: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var underline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rounded: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var error: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var secureTextEntry: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var success: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var last: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var picker: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class Item : Component<ItemProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface FormProps : RProps, Testable {
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class Form : Component<FormProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface FabProps : RProps, Testable {
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var direction: String? /* "down" | "up" | "left" | "right" */
        get() = definedExternally
        set(value) = definedExternally
    var containerStyle: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
    var onPress: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var position: String? /* "topLeft" | "topRight" | "bottomLeft" | "bottomRight" */
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

external class Fab : Component<FabProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface SeparatorProps : RProps, Testable {
    var bordered: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic /* RnViewStyleProp? | Array<RnViewStyleProp>? */
        get() = definedExternally
        set(value) = definedExternally
}

external class Separator : Component<SeparatorProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface LabelProps : RProps, Testable {
    var style: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var floatBack: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external class Label : Component<LabelProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface StyleProviderProps : RProps, Testable {
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external class StyleProvider : Component<StyleProviderProps, RState> {
    override fun render(): dynamic = definedExternally
}

external class ActionSheet {
    companion object {
        var show: (configuration: dynamic, onSelect: (index: Number) -> Unit) -> Unit
    }
}

external class Image : Component<ImageProps, RState> {
    override fun render(): dynamic = definedExternally
}

external class Segment : Component<ojaynico.kotlin.react.native.TextProps, RState> {
    override fun render(): dynamic = definedExternally
}

external class Root : Component<ojaynico.kotlin.react.native.TextProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface SwipeRowProps : RProps, Testable {
    var leftOpenValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rightOpenValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var closeOnRowPress: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableLeftSwipe: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableRightSwipe: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var recalculateHiddenLayout: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var preview: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var previewDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var directionalDistanceChangeThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var swipeToOpenPercent: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stopLeftSwipe: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stopRightSwipe: Number?
        get() = definedExternally
        set(value) = definedExternally
    var onRowOpen: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onRowClose: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var left: Any?
        get() = definedExternally
        set(value) = definedExternally
    var body: Any?
        get() = definedExternally
        set(value) = definedExternally
    var right: Any?
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

external class SwipeRow : Component<SwipeRowProps, RState> {
    override fun render(): dynamic = definedExternally
}

external class Toast {
    companion object {
        fun show(configuration: dynamic)
        fun hide()
    }
}

external interface AccordionProps : RProps, Testable {
    var dataArray: Array<Any>
    var headerStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var contentStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var renderHeader: ((item: Any, expanded: Boolean, index: Number) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var renderContent: ((item: Any, index: Number) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var expanded: Number?
        get() = definedExternally
        set(value) = definedExternally
    var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    var expandedIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var iconStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var expandedIconStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

external class Accordion : Component<AccordionProps, RState> {
    override fun render(): dynamic = definedExternally
}

external interface DatePickerProps : RProps, Testable {
    var defaultDate: Date?
        get() = definedExternally
        set(value) = definedExternally
    var minimumDate: Date?
        get() = definedExternally
        set(value) = definedExternally
    var maximumDate: Date?
        get() = definedExternally
        set(value) = definedExternally
    var locale: String?
        get() = definedExternally
        set(value) = definedExternally
    var placeHolderText: String?
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var placeHolderTextStyle: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var androidMode: String? /* "calendar" | "spinner" | "default" */
        get() = definedExternally
        set(value) = definedExternally
    var timeZoneOffsetInMinutes: Number?
        get() = definedExternally
        set(value) = definedExternally
    var modalTransparent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var animationType: String? /* "slide" | "fade" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onDateChange: ((date: Any) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var formatChosenDate: ((date: Any) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external class DatePicker : Component<DatePickerProps, RState> {
    override fun render(): dynamic = definedExternally
}
