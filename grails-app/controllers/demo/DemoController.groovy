package demo

class DemoController {
    public DemoController() {
        println 'a new controller is being created'
    }
    def index() {
        render 'the demo controller rendered this'
    }
}
