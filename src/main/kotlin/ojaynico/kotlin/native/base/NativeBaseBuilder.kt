package ojaynico.kotlin.native.base

import ojaynico.kotlin.react.native.ImageProps
import react.RBuilder
import react.RElementBuilder

fun RBuilder.view(handler: RElementBuilder<ViewProps>.() -> Unit) = child(View::class) {
    handler()
}

fun RBuilder.container(handler: RElementBuilder<ContainerProps>.() -> Unit) = child(Container::class) {
    handler()
}

fun RBuilder.header(handler: RElementBuilder<HeaderProps>.() -> Unit) = child(Header::class) {
    handler()
}

fun RBuilder.content(handler: RElementBuilder<ContentProps>.() -> Unit) = child(Content::class) {
    handler()
}

fun RBuilder.body(handler: RElementBuilder<BodyProps>.() -> Unit) = child(Body::class) {
    handler()
}

fun RBuilder.button(handler: RElementBuilder<ButtonProps>.() -> Unit) = child(Button::class) {
    handler()
}

fun RBuilder.left(handler: RElementBuilder<LeftProps>.() -> Unit) = child(Left::class) {
    handler()
}

fun RBuilder.right(handler: RElementBuilder<RightProps>.() -> Unit) = child(Right::class) {
    handler()
}

fun RBuilder.icon(handler: IconProps.() -> Unit) = child(Icon::class) {
    attrs(handler)
}

fun RBuilder.text(text: String, handler: RElementBuilder<TextProps>.() -> Unit) = child(Text::class) {
    this.childList.add(text)
    handler()
}

fun RBuilder.title(text: String, handler: TitleProps.() -> Unit) = child(Title::class) {
    this.childList.add(text)
    attrs(handler)
}

fun RBuilder.subTitle(text: String, handler: SubtitleProps.() -> Unit) = child(Subtitle::class) {
    this.childList.add(text)
    attrs(handler)
}

fun RBuilder.footer(handler: RElementBuilder<FooterProps>.() -> Unit) = child(Footer::class) {
    handler()
}

fun RBuilder.footerTab(handler: RElementBuilder<FooterTabProps>.() -> Unit) = child(FooterTab::class) {
    handler()
}

fun RBuilder.switch(handler: SwitchProps.() -> Unit) = child(Switch::class) {
    attrs(handler)
}

fun RBuilder.picker(handler: RElementBuilder<PickerProps>.() -> Unit) = child(Picker::class) {
    handler()
}

fun RBuilder.pickerItem(handler: PickerItemProps.() -> Unit) = child(Picker.Item::class) {
    attrs(handler)
}

fun RBuilder.list(handler: RElementBuilder<ListProps>.() -> Unit) = child(List::class) {
    handler()
}

fun RBuilder.listItem(handler: RElementBuilder<ListItemProps>.() -> Unit) = child(ListItem::class) {
    handler()
}

fun RBuilder.h1(text: String, handler: H1Props.() -> Unit) = child(H1::class) {
    this.childList.add(text)
    attrs(handler)
}

fun RBuilder.h2(text: String, handler: H2Props.() -> Unit) = child(H2::class) {
    this.childList.add(text)
    attrs(handler)
}

fun RBuilder.h3(text: String, handler: H3Props.() -> Unit) = child(H3::class) {
    this.childList.add(text)
    attrs(handler)
}

fun RBuilder.row(handler: RElementBuilder<RowProps>.() -> Unit) = child(Row::class) {
    handler()
}

fun RBuilder.col(handler: RElementBuilder<ColProps>.() -> Unit) = child(Col::class) {
    handler()
}

fun RBuilder.grid(handler: RElementBuilder<GridProps>.() -> Unit) = child(Grid::class) {
    handler()
}

fun RBuilder.inputGroup(handler: RElementBuilder<InputGroupProps>.() -> Unit) = child(InputGroup::class) {
    handler()
}

fun RBuilder.input(handler: InputProps.() -> Unit) = child(Input::class) {
    attrs(handler)
}

fun RBuilder.textarea(handler: TextareaProps.() -> Unit) = child(Textarea::class) {
    attrs(handler)
}

fun RBuilder.thumbnail(handler: ThumbnailProps.() -> Unit) = child(Thumbnail::class) {
    attrs(handler)
}

fun RBuilder.card(handler: RElementBuilder<CardProps>.() -> Unit) = child(Card::class) {
    handler()
}

fun RBuilder.cardItem(handler: RElementBuilder<CardItemProps>.() -> Unit) = child(CardItem::class) {
    handler()
}

fun RBuilder.cardSwiper(handler: RElementBuilder<CardSwiperProps>.() -> Unit) = child(CardSwiper::class) {
    handler()
}

fun RBuilder.deckSwiper(handler: RElementBuilder<DeckSwiperProps>.() -> Unit) = child(DeckSwiper::class) {
    handler()
}

fun RBuilder.badge(handler: RElementBuilder<BadgeProps>.() -> Unit) = child(Badge::class) {
    handler()
}

fun RBuilder.spinner(handler: SpinnerProps.() -> Unit) = child(Spinner::class) {
    attrs(handler)
}

fun RBuilder.checkBox(handler: CheckBoxProps.() -> Unit) = child(CheckBox::class) {
    attrs(handler)
}

fun RBuilder.radio(handler: RadioProps.() -> Unit) = child(Radio::class) {
    attrs(handler)
}

fun RBuilder.progressBar(handler: ProgressBarProps.() -> Unit) = child(ProgressBar::class) {
    attrs(handler)
}

fun RBuilder.drawer(handler: RElementBuilder<DrawerProps>.() -> Unit) = child(Drawer::class) {
    handler()
}

fun RBuilder.scrollableTab(handler: ScrollableTabProps.() -> Unit) = child(ScrollableTab::class) {
    attrs(handler)
}

fun RBuilder.tabs(handler: RElementBuilder<TabsProps>.() -> Unit) = child(Tabs::class) {
    handler()
}

fun RBuilder.tab(handler: RElementBuilder<TabProps>.() -> Unit) = child(Tab::class) {
    handler()
}

fun RBuilder.tabHeading(handler: RElementBuilder<TabHeadingProps>.() -> Unit) = child(TabHeading::class) {
    handler()
}

fun RBuilder.item(handler: RElementBuilder<ItemProps>.() -> Unit) = child(Item::class) {
    handler()
}

fun RBuilder.form(handler: RElementBuilder<FormProps>.() -> Unit) = child(Form::class) {
    handler()
}

fun RBuilder.fab(handler: RElementBuilder<FabProps>.() -> Unit) = child(Fab::class) {
    handler()
}

fun RBuilder.separator(handler: RElementBuilder<SeparatorProps>.() -> Unit) = child(Separator::class) {
    handler()
}

fun RBuilder.label(text: String, handler: LabelProps.() -> Unit) = child(Label::class) {
    this.childList.add(text)
    attrs(handler)
}

fun RBuilder.styleProvider(handler: RElementBuilder<StyleProviderProps>.() -> Unit) = child(StyleProvider::class) {
    handler()
}

fun RBuilder.image(handler: ImageProps.() -> Unit) = child(Image::class) {
    attrs(handler)
}

fun RBuilder.segment(handler: RElementBuilder<ojaynico.kotlin.react.native.TextProps>.() -> Unit) = child(Segment::class) {
    handler()
}

fun RBuilder.root(handler: RElementBuilder<ojaynico.kotlin.react.native.TextProps>.() -> Unit) = child(Root::class) {
    handler()
}

fun RBuilder.swipeRow(handler: SwipeRowProps.() -> Unit) = child(SwipeRow::class) {
    attrs(handler)
}

fun RBuilder.accordion(handler: AccordionProps.() -> Unit) = child(Accordion::class) {
    attrs(handler)
}

fun RBuilder.datePicker(handler: DatePickerProps.() -> Unit) = child(DatePicker::class) {
    attrs(handler)
}

