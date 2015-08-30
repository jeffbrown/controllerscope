package demo

class DemoController {

    int count = 0

    public DemoController() {
        println 'a new controller is being created'
    }
    def index() {
        count++
        render "The count is $count"
    }
}
