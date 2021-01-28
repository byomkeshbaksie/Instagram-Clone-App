package Model

class Post {

    private var postid: String = ""
    private var postimage: String = ""
    private var publisher: String = ""
    private var descripton: String = ""

    constructor()

    constructor(postid: String, postimage: String, publisher: String, descripton: String) {
        this.postid = postid
        this.postimage = postimage
        this.publisher = publisher
        this.descripton = descripton
    }

    fun getPostid(): String{
        return postid
    }

    fun getPostimage(): String{
        return postimage
    }

    fun getPublisher(): String{
        return publisher
    }

    fun getDescription(): String{
        return descripton
    }

    fun setPostid(postid: String)
    {
        this.postid = postid
    }

    fun setPostimage(postimage: String)
    {
        this.postimage = postimage
    }

    fun setPublisher(publisher: String)
    {
        this.publisher = publisher
    }

    fun setdescription(description: String)
    {
        this.descripton = description
    }

}