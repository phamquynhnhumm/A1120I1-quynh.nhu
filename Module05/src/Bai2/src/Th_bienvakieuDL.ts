function main() {
    console.log("START");
    if (true) {
        var lang = "vi";
        var target = "en-us";
        console.log("inside block");
        console.log(target);
    }
    console.log(lang);
    console.log(target);
}


function main2() {
    var x = 5;
    console.log(x);
    var x = 10;
    console.log(x);
    let y = 55;
    console.log(y);
    y = 100;
    console.log(y);
}


function main3() {
    var x = 5;
    console.log(x);
    let y = 10;
    console.log(y);

}


function main4() {
    let message: string;
    let total: number = 100;
    let isProduction = true;
    let prices: Array<number> = [120, 88, 60];
    let languages: string[] = ['vi', 'en-us'];
    let now = new Date();
    let unknown: any;

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    };

    function log(msg: string): void {
        console.log(msg)
    }

    interface IPost {
        id: string;
        title: string;
        body?: string;
    }

    isProduction = false;
    unknown = Direction.UP;
    unknown = 'changed';
    const post: IPost = {
        id: "quynhnhu",
        title: "xin chao",
    };
    message = "50";

    function getPost(postId: string): IPost {
        // do something to retrieve post
        return {
            id: postId,
            title: 'Post Title',
            body: 'Post Body',
            extra: 'data'
        } as IPost;
    }
}


main()
main2()
main3()
main4()

